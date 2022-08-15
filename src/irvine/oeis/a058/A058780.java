package irvine.oeis.a058;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A058780 Numbers n such that n^2 * 2^n + 1 is prime.
 * @author Sean A. Irvine
 */
public class A058780 implements Sequence {

  private int mN = 0;

  @Override
  public Z next() {
    while (true) {
      if (Z.valueOf((long) ++mN * mN).shiftLeft(mN).add(1).isProbablePrime()) {
        return Z.valueOf(mN);
      }
    }
  }
}
