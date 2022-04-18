package irvine.oeis.a046;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A046038 Numbers k for which [ (4/3)^k ] is composite.
 * @author Sean A. Irvine
 */
public class A046038 implements Sequence {

  private int mN = 2;
  private Z mA = Z.NINE;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      mA = mA.multiply(3);
      if (!Z.ONE.shiftLeft(2 * mN).divide(mA).isProbablePrime()) {
        return Z.valueOf(mN);
      }
    }
  }
}
