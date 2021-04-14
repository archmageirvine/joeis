package irvine.oeis.a046;

import irvine.math.z.Z;

/**
 * A046558 Even numbers in the numerators of the 1/3-Pascal triangle (by row).
 * @author Sean A. Irvine
 */
public class A046558 extends A046539 {

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
