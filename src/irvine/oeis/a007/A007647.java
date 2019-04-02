package irvine.oeis.a007;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A007647 Numbers n such that n*10^n + 1 is prime.
 * @author Sean A. Irvine
 */
public class A007647 implements Sequence {

  private int mN = 0;
  private Z mTens = Z.ONE;

  @Override
  public Z next() {
    while (true) {
      mTens = mTens.multiply(10);
      if (mTens.multiply(++mN).add(1).isProbablePrime()) {
        return Z.valueOf(mN);
      }
    }
  }
}

