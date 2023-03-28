package irvine.oeis.a024;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.a000.A000961;

/**
 * A024627 Positions of cubes among the powers of primes (A000961).
 * @author Sean A. Irvine
 */
public class A024627 extends A000961 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      if (ZUtils.isCube(super.next())) {
        return Z.valueOf(mN);
      }
    }
  }
}
