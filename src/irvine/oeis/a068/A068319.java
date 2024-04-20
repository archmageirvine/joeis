package irvine.oeis.a068;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.Sequence1;

/**
 * A068319 a(n) = if n &lt;= lpf(n)^2 then lpf(n) else a(lpf(n) + n/lpf(n)), where lpf = least prime factor, A020639.
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
    final Z lpf = Functions.LPF.z(n);
    return n.compareTo(lpf.square()) <= 0 ? lpf : a(lpf.add(n.divide(lpf)));
  }

  @Override
  public Z a(final int n) {
    return a(Z.valueOf(n));
  }
}
