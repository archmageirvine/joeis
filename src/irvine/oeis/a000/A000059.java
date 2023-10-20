package irvine.oeis.a000;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A000059 Numbers k such that (2k)^4 + 1 is prime.
 * @author Sean A. Irvine
 */
public class A000059 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      if (Z.valueOf(++mN).multiply2().pow(4).add(1).isProbablePrime()) {
        return Z.valueOf(mN);
      }
    }
  }
}

