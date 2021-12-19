package irvine.oeis.a053;

import irvine.math.z.Z;

/**
 * A053229 Numbers n for which second differences of sigma(n) are negative.
 * @author Sean A. Irvine
 */
public class A053229 extends A053223 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      final Z t = super.next();
      if (t.signum() < 0) {
        return Z.valueOf(mN);
      }
    }
  }
}
