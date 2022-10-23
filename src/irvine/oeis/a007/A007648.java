package irvine.oeis.a007;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A007648 n*18^n + 1 is a prime.
 * @author Sean A. Irvine
 */
public class A007648 extends Sequence1 {

  private int mN = 0;
  private Z mT = Z.ONE;

  @Override
  public Z next() {
    while (true) {
      mT = mT.multiply(18);
      if (mT.multiply(++mN).add(1).isProbablePrime()) {
        return Z.valueOf(mN);
      }
    }
  }
}

