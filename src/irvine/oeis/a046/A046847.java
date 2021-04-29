package irvine.oeis.a046;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A046847 Numbers n such that n*2^n - (n-1) is prime.
 * @author Sean A. Irvine
 */
public class A046847 implements Sequence {

  private int mN = -1;

  @Override
  public Z next() {
    while (true) {
      if (Z.valueOf(++mN).shiftLeft(mN).subtract(mN - 1).isProbablePrime()) {
        return Z.valueOf(mN);
      }
    }
  }
}
