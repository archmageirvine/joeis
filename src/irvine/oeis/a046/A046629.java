package irvine.oeis.a046;

import irvine.math.z.Z;

/**
 * A046629 Distinct even numbers in writing numerators of each element to the right of the central elements of the 1/5-Pascal triangle (by row).
 * @author Sean A. Irvine
 */
public class A046629 extends A046627 {

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
