package irvine.oeis.a070;

import irvine.math.z.Z;
import irvine.oeis.a001.A001359;

/**
 * A078923.
 * @author Sean A. Irvine
 */
public class A070020 extends A001359 {

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      if (p.square().add(p.multiply(3)).add(3).isProbablePrime()) {
        return p.add(1);
      }
    }
  }
}

