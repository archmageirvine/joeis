package irvine.oeis.a047;

import irvine.math.z.Z;

/**
 * A047768 a(n) = A047766(6n+2).
 * @author Sean A. Irvine
 */
public class A047768 extends A047766 {

  private int mN = 4;

  @Override
  public Z next() {
    while (true) {
      final Z t = super.next();
      if (++mN == 6) {
        mN = 0;
        return t;
      }
    }
  }
}

