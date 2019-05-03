package irvine.oeis.a100;

import irvine.math.z.Z;
import irvine.oeis.a005.A005150;

/**
 * A100108 Primes in <code>A005150</code>.
 * @author Sean A. Irvine
 */
public class A100108 extends A005150 {

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

