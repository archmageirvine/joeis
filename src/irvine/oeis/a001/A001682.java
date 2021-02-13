package irvine.oeis.a001;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A001682 Numbers k such that 3^k, 3^(k+1) and 3^(k+2) have the same number of digits.
 * @author Sean A. Irvine
 */
public class A001682 implements Sequence {

  long mN = -1;
  long mA = 0;
  long mB = 1;
  long mC = 1;
  Z mT = Z.THREE;

  @Override
  public Z next() {
    do {
      ++mN;
      mA = mB;
      mB = mC;
      mT = mT.multiply(3);
      mC = mT.toString().length();
    } while (mA != mC);
    return Z.valueOf(mN);
  }
}
