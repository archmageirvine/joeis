package irvine.oeis.a391;

import irvine.math.z.Z;
import irvine.oeis.a001.A001359;

/**
 * A082552/
 * @author Sean A. Irvine
 */
public class A391321 extends A001359 {

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next().multiply(3).add(2);
      if (p.isProbablePrime()) {
        return p;
      }
    }
  }
}
