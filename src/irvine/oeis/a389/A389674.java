package irvine.oeis.a389;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.Sequence1;

/**
 * A388063.
 * @author Sean A. Irvine
 */
public class A389674 extends Sequence1 implements DirectSequence {

  private long mN = 0;

  @Override
  public Z next() {
    return a(Z.valueOf(++mN));
  }

  @Override
  public Z a(Z n) {
    final Z base = Functions.DIGIT_SUM.z(n);
    if (base.isOne()) {
      return n;
    }
    Z res = Z.ZERO;
    Z mul = Z.ONE;
    while (!n.isZero()) {
      final Z[] qr = n.divideAndRemainder(base);
      res = res.add(mul.multiply(qr[1]));
      mul = mul.multiply(10);
      n = qr[0];
    }
    return res;
  }

  @Override
  public Z a(final int n) {
    return a(Z.valueOf(n));
  }
}

