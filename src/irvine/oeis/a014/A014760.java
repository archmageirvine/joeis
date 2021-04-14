package irvine.oeis.a014;

import irvine.math.z.Z;

/**
 * A014760 Squares of numbers in array formed from odd elements to the right of middle of rows of Pascal triangle that are not 1.
 * @author Sean A. Irvine
 */
public class A014760 extends A014475 {

  @Override
  public Z next() {
    while (true) {
      final Z t = super.next();
      if (t.isOdd() && !Z.ONE.equals(t)) {
        return t.square();
      }
    }
  }
}
