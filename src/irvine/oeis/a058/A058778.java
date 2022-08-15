package irvine.oeis.a058;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A058778 Numbers n such that n^2*2^n - n*2^((n + 1)/2) + 1 is prime.
 * @author Sean A. Irvine
 */
public class A058778 implements Sequence {

  private int mN = -1;

  @Override
  public Z next() {
    while (true) {
      mN += 2;
      if (Z.valueOf((long) mN * mN).shiftLeft(mN).subtract(Z.valueOf(mN).shiftLeft((mN + 1) / 2)).add(1).isProbablePrime()) {
        return Z.valueOf(mN);
      }
    }
  }
}
