package irvine.oeis.a064;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A064539 Numbers n such that 2^n + n^2 is prime.
 * @author Sean A. Irvine
 */
public class A064539 extends Sequence1 {

  private long mN = -1;

  @Override
  public Z next() {
    while (true) {
      mN += 2;
      if (Z.ONE.shiftLeft(mN).add(mN * mN).isProbablePrime()) {
        return Z.valueOf(mN);
      }
    }
  }
}

