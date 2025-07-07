package irvine.oeis.a078;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A078626 Primes p which concatenated with p+2 give a prime.
 * @author Sean A. Irvine
 */
public class A078626 extends A000040 {

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      if (new Z(p + p.add(2).toString()).isProbablePrime()) {
        return p;
      }
    }
  }
}

