package irvine.oeis.a007;

import irvine.math.z.Z;
import irvine.oeis.a092.A092845;

/**
 * A007523 Primes in <code>A092845 (decimal</code> expansion of Pi written <code>backwards)</code>.
 * @author Sean A. Irvine
 */
public class A007523 extends A092845 {

  @Override
  public Z next() {
    while (true) {
      final Z a = super.next();
      if (a.isProbablePrime()) {
        return a;
      }
    }
  }
}
