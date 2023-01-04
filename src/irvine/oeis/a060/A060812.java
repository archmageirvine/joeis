package irvine.oeis.a060;

import irvine.math.z.Z;

/**
 * A060812 Numbers whose square has a majority of one digit and does not end in 0.
 * @author Sean A. Irvine
 */
public class A060812 extends A060811 {

  @Override
  public Z next() {
    while (true) {
      final Z t = super.next();
      if (t.mod(10) != 0) {
        return t;
      }
    }
  }
}
