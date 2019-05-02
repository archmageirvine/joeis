package irvine.oeis.a020;

import irvine.factor.factor.Cheetah;
import irvine.math.z.Z;
import irvine.oeis.a005.A005117;

/**
 * A020893.
 * @author Sean A. Irvine
 */
public class A020893 extends A005117 {

  @Override
  public Z next() {
    outer:
    while (true) {
      final Z a = super.next();
      for (final Z p : Cheetah.factor(a).toZArray()) {
        if (p.mod(4) == 3) {
          continue outer;
        }
      }
      return a;
    }
  }
}
