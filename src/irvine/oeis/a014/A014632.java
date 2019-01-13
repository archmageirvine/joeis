package irvine.oeis.a014;

import irvine.math.z.Z;
import irvine.oeis.a000.A000326;

/**
 * A014632.
 * @author Sean A. Irvine
 */
public class A014632 extends A000326 {

  @Override
  public Z next() {
    while (true) {
      final Z a = super.next();
      if (!a.isEven()) {
        return a;
      }
    }
  }
}
