package irvine.oeis.a036;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A036057.
 * @author Sean A. Irvine
 */
public class A036057 implements Sequence {

  // This implementation was based on existing code for solving the 4,4,4,4 problem.
  // It likely contains some legacy functionality not needed here.

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

  private Node mAnswer = null;
  private int mN = 24; //16386; //24;
  private String mTrivial = null;

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
    mAnswer = null;
    mResults.clear();
    mPriority.clear();
    mMaxUsed = (1 << nums.length) - 1;
    // Initialize the queue with digits.
    final StringBuilder sb = new StringBuilder();
    for (int i = 0; i < nums.length; ++i) {
      insert(nums[i].charAt(0) - '0', 1 << i, nums[i]);
      sb.append(nums[i]);
      if (i > 0) {
        sb.append('C');
      }
    }
    mTrivial = sb.toString();
    // This may over generate, but is guaranteed to get them all at least once
    // k counts over length of concatenates, i over input digits, and j current list
    for (int k = 1; k < nums.length; ++k) {
      for (int i = 0; i < nums.length; ++i) {
        final ArrayList<Node> copy = new ArrayList<>(mPriority);
        for (final Node t : copy) {
          insert(t.mValue * 10.0 + nums[i].charAt(0) - '0', isPermitted(t.mUsed, 1 << i), t.mDesc + nums[i] + 'C');
        }
      }
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

  private boolean isNontrivial(final Node n) {
    return n != null && !mTrivial.equals(n.mDesc);
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
    if (used == 0 /*|| v < 0*/ || v > mN * (double) mN || Double.isNaN(v)) {
      return;
    } else if (v != 0.0 && v < 1.0e-6) {
      return;
    }
    final boolean integer = Math.abs(v - Math.floor(v)) < TOLERANCE;
    final int vv = (int) v;
    final Node n = new Node(v, used, desc);
    if (used == mMaxUsed) {
      if (integer && vv == mN && isNontrivial(n)) {
        mAnswer = n;
      }
      return;
    }
//      if (Integer.bitCount(used) > 1) {
//        final Node x = new Node(0.0, 0, null);
//        x.mValue = v;
//        for (int i = 1; i < mMaxUsed; i <<= 1) {
//          if ((used | i) == used) {
//            x.mUsed = used & ~i;
//            if (mResults.get(x) != null) {
//              return;
//            }
//          }
//        }
//      }
    // Reject queue addition if we have the node already.
    if (mResults.contains(n)) {
      return;
    }
    if (mPriority.contains(n)) {
      return;
//    } else if (!integer && Integer.bitCount(used) > 3) {
//      return; // make 2 for more speed 3 for thorough
    }
    // Otherwise add it to the hash map and queue.
    if (integer) {
      mPriority.addFirst(n);
    } else {
      mPriority.addLast(n);
    }
    mResults.add(n);
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
      if (mAnswer != null) {
        return; // We have solved it
      }
      final Node n = mPriority.removeFirst();
      final double nv = n.mValue;
      if (n.mUsed != mMaxUsed) {
        if (nv != 0 && !n.mDesc.endsWith("u")) {
          insert(-nv, n.mUsed, n.mDesc + 'u'); // unary minus
        }
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
          insert(Math.pow(bv, nv), mask, b.mDesc + n.mDesc + '^');
          insert(Math.pow(nv, bv), mask, n.mDesc + b.mDesc + '^');
        }
      }
    }
  }

  private boolean isFriedman(final int n) {
    //System.out.println("trying: " + n);
    final String s = String.valueOf(n);
    final String[] digits = new String[s.length()];
    for (int k = 0; k < digits.length; ++k) {
      digits[k] = s.substring(k, k + 1);
    }
    crunch(digits);
    return mAnswer != null;
  }

  @Override
  public Z next() {
    while (true) {
      if (isFriedman(++mN)) {
        if (mVerbose) {
          System.out.println(mAnswer.mDesc);
        }
        return Z.valueOf(mN);
      }
    }
  }
}

