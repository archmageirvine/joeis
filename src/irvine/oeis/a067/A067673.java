package irvine.oeis.a067;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A067673 Floor((3/2)^(n+3))/floor((3/2)^n)=(3/2)^3.
 * @author Sean A. Irvine
 */
public class A067673 extends Sequence1 {

  private long mN = 0;
  private Z mT = Z.ONE;

  @Override
  public Z next() {
    while (true) {
      mT = mT.multiply(3);
      if (mT.multiply(27).shiftRight(++mN + 3).shiftLeft(3).equals(mT.shiftRight(mN).multiply(27))) {
        return Z.valueOf(mN);
      }
    }
  }
}

