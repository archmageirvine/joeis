package irvine.oeis.a070;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A070191 Numbers k such that gcd(3*k, 8^k+1) = 3.
 * @author Sean A. Irvine
 */
public class A070191 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      if (Z.valueOf(3 * ++mN).gcd(Z.ONE.shiftLeft(3 * mN).add(1)).equals(Z.THREE)) {
        return Z.valueOf(mN);
      }
    }
  }
}
