package irvine.oeis.a007;

import java.util.TreeSet;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A007622 Consider Leibniz's harmonic triangle (A003506) and look at the non-boundary terms. Sequence gives numbers appearing in denominators, sorted.
 * @author Sean A. Irvine
 */
public class A007622 extends Sequence1 {

  private final TreeSet<Z> mSeq = new TreeSet<>();
  private Z mNextUpdate = Z.ZERO;
  private long mN = 2;

  private void update() {
    ++mN;
    for (long m = 2; m < mN; ++m) {
      mSeq.add(Binomial.binomial(mN, m).multiply(m));
    }
    mNextUpdate = Binomial.binomial(mN + 1, 2).multiply2();
  }

  @Override
  public Z next() {
    if (mSeq.isEmpty() || mSeq.first().compareTo(mNextUpdate) >= 0) {
      update();
    }
    return mSeq.pollFirst();
  }
}

