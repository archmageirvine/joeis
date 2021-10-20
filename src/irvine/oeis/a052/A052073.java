package irvine.oeis.a052;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A052073 Primes p with the property that nextprime(p) is a substring of p^2.
 * @author Sean A. Irvine
 */
public class A052073 extends A000040 {

  private Z mP = super.next();

  @Override
  public Z next() {
    while (true) {
      final String s = mP.square().toString();
      final Z p = mP;
      mP = super.next();
      if (s.contains(mP.toString())) {
        return p;
      }
    }
  }
}

