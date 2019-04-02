package irvine.oeis.a001;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A001770 Numbers k such that 5*2^k - 1 is prime.
 * @author Sean A. Irvine
 */
public class A001770 implements Sequence {

  private Z mP = Z.FIVE;
  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      mN += 2;
      mP = mP.shiftLeft(2);
      if (mP.subtract(1).isProbablePrime()) {
        return Z.valueOf(mN);
      }
    }
  }
}
