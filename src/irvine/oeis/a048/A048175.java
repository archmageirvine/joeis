package irvine.oeis.a048;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence;
import irvine.util.string.StringUtils;

/**
 * A048175 Size of range 1...m generatable from the digits of an n-digit integer and + - x /.
 * @author Sean A. Irvine
 */
public class A048175 implements Sequence {

  /** Constant controlling how close to integral a result needs to be */
  private static final double TOLERANCE = 1E-7;

  /** Structure for entries in hash table. */
  private static class Node {
    double mValue;
    int mUsed;
    final String mDesc;

    Node(final double v, final int used, final String desc) {
      mValue = v;
      mUsed = used;
      mDesc = desc;
    }
    @Override
    public boolean equals(final Object a) {
      return a instanceof Node && mUsed == ((Node) a).mUsed && Math.abs(mValue - ((Node) a).mValue) < TOLERANCE;
    }
    @Override
    public int hashCode() {
      return mUsed ^ (int) (mValue * 1000.0);
    }
  }

  private final boolean mVerbose = "true".equals(System.getProperty("oeis.verbose"));

  private final Set<Node> mResults = new HashSet<>();

  /** Queue of candidate numbers awaiting operations. */
  private final LinkedList<Node> mPriority = new LinkedList<>();

  /** Large used number (essentially 2^digits-1). */
  private int mMaxUsed;

  private Node[] mAnswer;
  private int mN = 10;
  private int mLim = 10;

  /**
   * Crunch the specified numbers.
   * @param nums numbers
   */
  private void crunch(final String[] nums) {
    assert nums.length <= 32;
    for (final String num : nums) {
      if (num.length() > 1 || num.charAt(0) < '0' || num.charAt(0) > '9') {
        throw new IllegalArgumentException(num + " is not a single digit");
      }
    }
    Arrays.fill(mAnswer, null);
    mResults.clear();
    mPriority.clear();
    mMaxUsed = (1 << nums.length) - 1;
    // Initialize the queue with digits.
    for (int i = 0; i < nums.length; ++i) {
      insert(nums[i].charAt(0) - '0', 1 << i, nums[i]);
    }
    // Finally, start the guzzler.
    guzzle();
  }

  /**
   * By examining the used digits, determine if a proposed operation
   * can proceed. Returns 0 if the operation should not be permitted,
   * and return the new used mask if the operations should be allowed
   * to proceed.
   * @param a first mask
   * @param b second mask
   * @return zero or resulting mask
   */
  private static int isPermitted(final int a, final int b) {
    return (a & b) != 0 ? 0 : (a | b);
  }

  /**
   * Record a value in the table of results. The new value is only stored
   * if it represents something that we have not already obtained using
   * the same digits by simpler means.
   *
   * Note insertion tests are always with respect to <code>mResults</code>.
   *
   * @param v value
   * @param used digits used in construction
   * @param desc description for value
   */
  private void insert(final double v, final int used, final String desc) {
    //System.out.println(desc);
    if (used == 0 || v < 0 || v > mN * (double) mN || Double.isNaN(v)) {
      return;
    } else if (v != 0.0 && v < 1.0e-6) {
      return;
    }
    final boolean integer = v - Math.floor(v) < TOLERANCE;
    final int vv = (int) v;
    final Node n = new Node(v, used, desc);
    if (used == mMaxUsed) {
      if (integer && vv < mAnswer.length) {
        mAnswer[vv] = n;
      }
      return;
    }
    if (!mResults.add(n)) {
      return;
    }
    // Otherwise add it to the hash map and queue.
    if (integer) {
      mPriority.addFirst(n);
    } else {
      mPriority.addLast(n);
    }
  }

  /**
   * Pop the first entry of the queue and apply all valid operations to this
   * entry. In the case of non-unary operations it is applied against every
   * other entry in the table of results. For unary operations this will
   * simply involve adding some more elements to process.
   *
   * The procedure returns only once the queue of candidates is empty or
   * until the required number has been generated.
   */
  private void guzzle() {
    while (!mPriority.isEmpty()) {
      final Node n = mPriority.removeFirst();
      final double nv = n.mValue;
      if (n.mUsed != mMaxUsed) {
        for (final Node b : new HashSet<>(mResults)) {
          final double bv = b.mValue;
          final int mask = isPermitted(n.mUsed, b.mUsed);
          if (mask == 0) {
            continue; // invalid operation
          }
          insert(nv + bv, mask, n.mDesc + b.mDesc + '+');
          insert(nv - bv, mask, n.mDesc + b.mDesc + '-');
          insert(bv - nv, mask, b.mDesc + n.mDesc + '-');
          insert(nv / bv, mask, n.mDesc + b.mDesc + '/');
          insert(bv / nv, mask, b.mDesc + n.mDesc + '/');
          insert(bv * nv, mask, b.mDesc + n.mDesc + '*');
        }
      }
    }
  }

  private int findMax(final int n) {
    // We only need to actually do the computation if this number contains a set of
    // digits that will not be considered at some other point.  We choose to run
    // the largest number containing a given set of digits.
    //System.out.println("trying: " + n);
    final Z m = Z.valueOf(n);
    if (ZUtils.sortDigitsDescending(m).equals(m)) {
      final String s = String.valueOf(n);
      final String[] digits = new String[s.length()];
      for (int k = 0; k < digits.length; ++k) {
        digits[k] = s.substring(k, k + 1);
      }
      crunch(digits);
      for (int k = 1; k < mAnswer.length; ++k) {
        if (mAnswer[k] == null) {
          return k - 1;
        }
      }
      throw new UnsupportedOperationException();
    }
    return -1; // no need to run this
  }

  @Override
  public Z next() {
    mLim *= 10;
    mAnswer = new Node[mLim]; // heuristic (failure will be detected)
    int best = 0;
    while (mN < mLim) {
      final int max = findMax(mN);
      if (max > best) {
        if (mVerbose) {
          StringUtils.message("New best is " + max + " for " + mN);
        }
        best = max;
      }
      ++mN;
    }
    return Z.valueOf(best);
  }

  /**
   * Main used for explicit representations for a given number.
   * @param args number to run
   */
  public static void main(final String[] args) {
    final A048175 seq = new A048175();
    seq.mAnswer = new Node[1000000];
    final int res = seq.findMax(Integer.parseInt(args[0]));
    for (int k = 1; k <= res; ++k) {
      System.out.println(k + " = " + seq.mAnswer[k].mDesc);
    }
  }
}

