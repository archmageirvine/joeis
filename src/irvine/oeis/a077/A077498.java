package irvine.oeis.a077;

import irvine.math.z.Z;
import irvine.oeis.a003.A003591;

/**
 * A077497.
 * @author Sean A. Irvine
 */
public class A077498 extends A003591 {

  @Override
  public Z next() {
    while (true) {
      final Z t = super.next().add(1);
      if (t.isProbablePrime()) {
        return t;
      }
    }
  }
}
