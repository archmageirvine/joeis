package irvine.oeis.a067;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A067542 Primes p such that p+5==0 (mod phi(p+5)).
 * @author Sean A. Irvine
 */
public class A067542 extends A000040 {

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      final Z p5 = p.add(5);
      if (p5.mod(Functions.PHI.z(p5)).isZero()) {
        return p;
      }
    }
  }
}
