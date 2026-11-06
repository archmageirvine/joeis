package irvine.oeis.a087;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a003.A003418;
import irvine.oeis.a106.A106441;

/**
 * A401432 a(n) is the smallest integer > 1 of the form sum_{i = 1..n} x^(1/i)/n. x is given by A106441(n)^A003418(n).
 * @author Sean A. Irvine
 */
public class A087313 extends A106441 {

  private final Sequence mA = new A003418().skip();
  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    final long pow = mA.next().longValueExact();
    final Z x = super.next();
    Z sum = Z.ZERO;
    for (long i = 1; i <= mN; ++i) {
      sum = sum.add(x.pow(pow / i));
    }
    return sum.divide(mN);
  }
}
