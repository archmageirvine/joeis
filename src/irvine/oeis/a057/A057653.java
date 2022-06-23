package irvine.oeis.a057;

import irvine.math.z.Z;
import irvine.oeis.a001.A001481;

/**
 * A057653 Odd numbers of form x^2 + y^2.
 * @author Sean A. Irvine
 */
public class A057653 extends A001481 {

  @Override
  public Z next() {
    while (true) {
      final Z a = super.next();
      if (a.isOdd()) {
        return a;
      }
    }
  }
}
