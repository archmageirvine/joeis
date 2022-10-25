package irvine.oeis.a005;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.MemorySequence;

/**
 * A005282 Mian-Chowla sequence (a B_2 sequence): a(1) = 1; for n&gt;1, a(n) = smallest number &gt; a(n-1) such that the pairwise sums of elements are all distinct.
 * @author Sean A. Irvine
 */
public class A005282 extends MemorySequence {

  private final TreeSet<Z> mSums = new TreeSet<>();
  private final Z mFirst;
  private final Z mSecond;

  protected A005282(final Z first, final Z second) {
    super(1);
    mFirst = first;
    mSecond = second;
  }

  /** Construct the sequence. */
  public A005282() {
    this(Z.ONE, Z.TWO);
  }

  @Override
  protected Z computeNext() {
    final int s = size();
    if (s == 0) {
      return mFirst;
    } else if (s == 1) {
      mSums.add(mSecond.multiply2());
      mSums.add(mFirst.add(mSecond));
      return mSecond;
    }
    Z n = get(size() - 1);
    while (true) {
      n = n.add(1);
      boolean ok = true;
      for (final Z a : this) {
        if (mSums.contains(a.add(n))) {
          ok = false;
          break;
        }
      }
      if (ok) {
        mSums.add(n.multiply2());
        for (final Z a : this) {
          mSums.add(a.add(n));
        }
        return n;
      }
    }
  }
}

