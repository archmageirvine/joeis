package irvine.oeis.a046;

import irvine.math.z.Z;

/**
 * A046609 Odd numbers in the numerators of the 1/5-Pascal triangle (by row).
 * @author Sean A. Irvine
 */
public class A046609 extends A046606 {

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
