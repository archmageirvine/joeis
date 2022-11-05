package irvine.oeis.a054;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a002.A002110;
import irvine.oeis.a065.A065091;

/**
 * A054758 a(n) is the smallest multiplier w such that A002110(n)*w + prime(n+1)^2 is prime.
 * @author Sean A. Irvine
 */
public class A054758 extends A002110 {

  private final Sequence mA = new A065091();
  {
    setOffset(1);
    super.next(); // skip 0#
  }

  @Override
  public Z next() {
    final Z q = super.next();
    final Z p2 = mA.next().square();
    long k = 0;
    while (true) {
      final Z t = q.multiply(++k).add(p2);
      if (t.isProbablePrime()) {
        return Z.valueOf(k);
      }
    }
  }
}
