package irvine.oeis.a037;

import irvine.factor.factor.Jaguar;
import irvine.math.group.IntegersModMul;
import irvine.math.z.Euler;
import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A037179 Number of cycles when squaring modulo n-th prime.
 * @author Sean A. Irvine
 */
public class A037179 extends A000040 {

  @Override
  public Z next() {
    final Z[] div = Jaguar.factor(super.next().subtract(1).makeOdd()).divisorsSorted();
    final Z rho = div[div.length - 1];
    Z sum = Z.ONE;
    for (final Z d : Jaguar.factor(rho).divisors()) {
      sum = sum.add(Euler.phi(d).divide(Z.ONE.equals(d) ? Z.ONE : new IntegersModMul(d).order(Z.TWO)));
    }
    return sum;
  }
}
