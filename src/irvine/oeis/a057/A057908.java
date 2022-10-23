package irvine.oeis.a057;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A057908 Numbers n such that 4^n - n is prime.
 * @author Sean A. Irvine
 */
public class A057908 extends Sequence1 {

  private Z mA = Z.ONE;
  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      mA = mA.shiftLeft(2);
      if (mA.subtract(++mN).isProbablePrime()) {
        return Z.valueOf(mN);
      }
    }
  }
}

