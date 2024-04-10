package irvine.oeis.a069;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A069171 Numbers k such that gcd(k, 2^k-1) = 3.
 * @author Sean A. Irvine
 */
public class A069171 extends Sequence1 {

  private long mN = 5;

  @Override
  public Z next() {
    while (true) {
      if (Z.THREE.equals(Z.ONE.shiftLeft(++mN).subtract(1).gcd(mN))) {
        return Z.valueOf(mN);
      }
    }
  }
}

