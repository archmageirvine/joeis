package irvine.oeis.a069;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A069254 k/10 when gcd(k, 2^k+1) = 5.
 * @author Sean A. Irvine
 */
public class A069254 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      mN += 10;
      if (Z.valueOf(mN).gcd(Z.ONE.shiftLeft(mN).add(1)).equals(Z.FIVE)) {
        return Z.valueOf(mN / 10);
      }
    }
  }
}
