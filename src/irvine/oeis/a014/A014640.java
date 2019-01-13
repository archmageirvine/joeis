package irvine.oeis.a014;

import irvine.math.z.Z;
import irvine.oeis.a000.A000566;

/**
 * A014640.
 * @author Sean A. Irvine
 */
public class A014640 extends A000566 {

  @Override
  public Z next() {
    while (true) {
      final Z a = super.next();
      if (a.isEven()) {
        return a;
      }
    }
  }
}
