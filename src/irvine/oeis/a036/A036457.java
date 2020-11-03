package irvine.oeis.a036;

import irvine.math.z.Z;

/**
 * A036457 Numbers k for which exactly 5 applications of A000005 are needed to reach 2.
 * @author Sean A. Irvine
 */
public class A036457 extends A036459 {

  @Override
  public Z next() {
    while (true) {
      final Z s = super.next();
      if (Z.FIVE.equals(s)) {
        return mN;
      }
    }
  }
}

