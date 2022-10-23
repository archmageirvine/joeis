package irvine.oeis.a058;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A058911 Numbers k such that k^k + k + 1 is prime.
 * @author Sean A. Irvine
 */
public class A058911 extends Sequence1 {

  private long mN = -1;

  @Override
  public Z next() {
    while (true) {
      if (Z.valueOf(++mN).pow(mN).add(mN + 1).isProbablePrime()) {
        return Z.valueOf(mN);
      }
    }
  }
}
