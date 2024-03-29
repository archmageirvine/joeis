package irvine.oeis.a052;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A052075 Primes p such that nextprime(p) is substring of p^3.
 * @author Sean A. Irvine
 */
public class A052075 extends A000040 {

  private Z mP = super.next();

  @Override
  public Z next() {
    while (true) {
      final String s = mP.pow(3).toString();
      final Z p = mP;
      mP = super.next();
      if (s.contains(mP.toString())) {
        return p;
      }
    }
  }
}

