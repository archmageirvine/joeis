package irvine.oeis.a080;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a002.A002808;

/**
 * A080365 Composite numbers k whose smallest and largest prime factors are unitary prime factors.
 * @author Sean A. Irvine
 */
public class A080365 extends A002808 {

  @Override
  public Z next() {
    while (true) {
      final Z c = super.next();
      final Z lpf = Functions.LPF.z(c);
      if (Functions.GCD.z(lpf, c.divide(lpf)).isOne()) {
        final Z gpf = Functions.GPF.z(c);
        if (Functions.GCD.z(gpf, c.divide(gpf)).isOne()) {
          return c;
        }
      }
    }
  }
}
