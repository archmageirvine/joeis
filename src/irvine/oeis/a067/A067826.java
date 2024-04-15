package irvine.oeis.a067;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A067826 Primes p such that sigma(2*p+1) &gt; 3*(p+1).
 * @author Sean A. Irvine
 */
public class A067826 extends A000040 {

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      if (Functions.SIGMA.z(p.multiply2().add(1)).compareTo(p.multiply(3).add(3)) > 0) {
        return p;
      }
    }
  }
}
