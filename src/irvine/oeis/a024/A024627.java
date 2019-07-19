package irvine.oeis.a024;

import irvine.math.z.Z;
import irvine.oeis.a000.A000961;
import irvine.oeis.a009.A009421;

/**
 * A024627 Positions of cubes among the powers of primes <code>(A000961)</code>.
 * @author Sean A. Irvine
 */
public class A024627 extends A000961 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      if (A009421.isCube(super.next())) {
        return Z.valueOf(mN);
      }
    }
  }
}
