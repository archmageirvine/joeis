package irvine.oeis.a046;

import irvine.math.z.Z;

/**
 * A046542 Odd numbers among the numerators of the 1/3-Pascal triangle (by row).
 * @author Sean A. Irvine
 */
public class A046542 extends A046539 {

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
