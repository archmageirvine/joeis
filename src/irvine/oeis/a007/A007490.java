package irvine.oeis.a007;

import irvine.math.z.Z;
import irvine.oeis.a003.A003072;

/**
 * A007490 Primes of form x^3 + y^3 + z^3 where x,y,z &gt; 0.
 * @author Sean A. Irvine
 */
public class A007490 extends A003072 {

  @Override
  public Z next() {
    while (true) {
      final Z t = super.next();
      if (t.isProbablePrime()) {
        return t;
      }
    }
  }
}
