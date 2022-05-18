package irvine.oeis.a050;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A050448 a(n) = Sum_{d|n, d==1 (mod 4)} d^4.
 * @author Sean A. Irvine
 */
public class A050448 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    Z sum = Z.ZERO;
    for (final Z d : Jaguar.factor(++mN).divisors()) {
      if (d.mod(4) == 1) {
        sum = sum.add(d.pow(4));
      }
    }
    return sum;
  }
}
