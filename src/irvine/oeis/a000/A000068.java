package irvine.oeis.a000;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A000068 Numbers k such that k^4 + 1 is prime.
 * @author Sean A. Irvine
 */
public class A000068 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      if (Z.valueOf(++mN).pow(4).add(1).isProbablePrime()) {
        return Z.valueOf(mN);
      }
    }
  }
}

