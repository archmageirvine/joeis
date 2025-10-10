package irvine.oeis.a081;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A081025 Variation on Ulam numbers: a(1) = 1; a(2) = 2; for n&gt;2, a(n) is smallest (n odd) or largest (n even) new number that is the sum of two distinct earlier terms.
 * @author Sean A. Irvine
 */
public class A081025 extends AbstractSequence {

  /**
   * Constructor with offset.
   * @param offset first index
   */
  protected A081025(final int offset) {
    super(offset);
  }

  /** Construct the sequence. */
  public A081025() {
    super(1);
  }

  // Ulam numbers
  protected final ArrayList<Z> mSeq = new ArrayList<>();
  private final TreeSet<Z> mSums = new TreeSet<>();
  private final HashSet<Z> mNotUnique = new HashSet<>();
  private final HashSet<Z> mUsed = new HashSet<>();
  private boolean mEven = true;

  protected Z a1() {
    return Z.ONE;
  }

  protected Z a2() {
    return Z.TWO;
  }

  @Override
  public Z next() {
    if (mSeq.isEmpty()) {
      final Z a1 = a1();
      mSeq.add(a1);
      return a1;
    }
    if (mSeq.size() == 1) {
      final Z a2 = a2();
      mSeq.add(a2);
      mSums.add(a2.add(a1()));
      return a2;
    }
    mEven = !mEven;
    while (true) {
      final Z next = mEven ? mSums.pollLast() : mSums.pollFirst();
      if (mUsed.contains(next)) {
        continue;
      }
      if (mNotUnique.contains(next)) {
        mNotUnique.remove(next);
        continue;
      }
      for (final Z v : mSeq) {
        final Z s = v.add(next);
        if (!mSums.add(s)) {
          mNotUnique.add(s);
        }
      }
      mUsed.add(next);
      mSeq.add(next);
      return next;
    }
  }
}
