package irvine.oeis.a035;

import irvine.math.z.Z;
import irvine.oeis.a034.A034886;

/**
 * A035066 Prime lengths of factorials: see A035065.
 * @author Sean A. Irvine
 */
public class A035066 extends A034886 {

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
