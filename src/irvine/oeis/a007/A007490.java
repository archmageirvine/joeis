package irvine.oeis.a007;

import irvine.math.z.Z;
import irvine.oeis.a003.A003072;

/**
 * A007490 Primes of form <code>x^3 +</code> y^3 + z^3 where x,y,z <code>&gt; 0</code>.
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
