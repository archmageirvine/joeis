package irvine.oeis.a134;

import irvine.math.z.Z;
import irvine.oeis.a038.A038399;

/**
 * A134069.
 * @author Sean A. Irvine
 */
public class A134069 extends A038399 {

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

