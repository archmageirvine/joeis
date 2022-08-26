package irvine.oeis.a058;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A058767 Numbers k such that k*2^(k/2) + 1 is prime.
 * @author Sean A. Irvine
 */
public class A058767 implements Sequence {

  private int mN = 0;

  @Override
  public Z next() {
    while (true) {
      mN += 2;
      if (Z.valueOf(mN).shiftLeft(mN / 2).add(1).isProbablePrime()) {
        return Z.valueOf(mN);
      }
    }
  }
}
