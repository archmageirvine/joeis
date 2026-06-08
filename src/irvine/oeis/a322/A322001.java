package irvine.oeis.a322;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.Sequence0;

/**
 * A322001 Digits of n interpreted in factorial base: a(Sum d_k*10^k) = Sum d_k*k!.
 * @author Sean A. Irvine
 */
public class A322001 extends Sequence0 implements DirectSequence {

  private long mN = -1;

  @Override
  public Z next() {
    return a(++mN);
  }

  @Override
  public Z a(Z n) {
    Z res = Z.ZERO;
    int j = 1;
    while (!n.isZero()) {
      final Z[] qr = n.divideAndRemainder(Z.TEN);
      res = res.add(qr[1].multiply(Functions.FACTORIAL.z(j++)));
      n = qr[0];
    }
    return res;
  }

  @Override
  public Z a(final long n) {
    return a(Z.valueOf(n));
  }
}
