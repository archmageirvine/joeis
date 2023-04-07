package irvine.oeis.a062;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A062718 p and p^2 + 6 are both prime.
 * @author Sean A. Irvine
 */
public class A062718 extends A000040 {

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      if (p.square().add(6).isProbablePrime()) {
        return p;
      }
    }
  }
}

