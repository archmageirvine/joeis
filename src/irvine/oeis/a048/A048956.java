package irvine.oeis.a048;

import irvine.math.z.Z;
import irvine.oeis.a001.A001203;

/**
 * A048956 3-digit terms in the continued fraction for Pi.
 * @author Sean A. Irvine
 */
public class A048956 extends A001203 {

  private static final Z LOWER = Z.valueOf(100);
  private static final Z UPPER = Z.valueOf(1000);

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
