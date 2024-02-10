package irvine.oeis.a068;

import irvine.factor.factor.LeastPrimeFactorizer;
import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.Sequence1;

/**
 * A068308.
 * @author Sean A. Irvine
 */
public class A068319 extends Sequence1 implements DirectSequence {

  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    mN = mN.add(1);
    return a(mN);
  }

  @Override
  public Z a(final Z n) {
    final Z lpf = LeastPrimeFactorizer.lpf(n);
    return n.compareTo(lpf.square()) <= 0 ? lpf : a(lpf.add(n.divide(lpf)));
  }

  @Override
  public Z a(final int n) {
    return a(Z.valueOf(n));
  }
}
