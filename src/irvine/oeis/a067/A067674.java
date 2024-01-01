package irvine.oeis.a067;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A067674 Floor((3/2)^(n+4))/floor((3/2)^n)=(3/2)^4.
 * @author Sean A. Irvine
 */
public class A067674 extends Sequence1 {

  private long mN = 0;
  private Z mT = Z.ONE;

  @Override
  public Z next() {
    while (true) {
      mT = mT.multiply(3);
      if (mT.multiply(81).shiftRight(++mN + 4).shiftLeft(4).equals(mT.shiftRight(mN).multiply(81))) {
        return Z.valueOf(mN);
      }
    }
  }
}

