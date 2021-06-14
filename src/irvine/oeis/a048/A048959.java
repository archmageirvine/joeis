package irvine.oeis.a048;

import irvine.math.z.Z;
import irvine.oeis.a001.A001203;

/**
 * A048959 Positions of 4-digit terms in the continued fraction for Pi (3 is at position 0).
 * @author Sean A. Irvine
 */
public class A048959 extends A001203 {

  private static final Z LOWER = Z.valueOf(1000);
  private static final Z UPPER = Z.valueOf(10000);

  @Override
  public Z next() {
    while (true) {
      final Z t = super.next();
      if (t.compareTo(LOWER) >= 0 && t.compareTo(UPPER) < 0) {
        return t;
      }
    }
  }
}
