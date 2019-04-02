package irvine.oeis.a007;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A007648 n*18^n + 1 is a prime.
 * @author Sean A. Irvine
 */
public class A007648 implements Sequence {

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

