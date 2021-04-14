package irvine.oeis.a046;

import irvine.math.z.Z;

/**
 * A046571 Odd numbers in the numerators of the 1/4-Pascal triangle (by row).
 * @author Sean A. Irvine
 */
public class A046571 extends A046568 {

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
