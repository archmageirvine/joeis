package irvine.oeis.a057;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A057909 Numbers k such that 4^k + k is prime.
 * @author Sean A. Irvine
 */
public class A057909 implements Sequence {

  private Z mA = Z.ONE;
  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      mA = mA.shiftLeft(2);
      if (mA.add(++mN).isProbablePrime()) {
        return Z.valueOf(mN);
      }
    }
  }
}

