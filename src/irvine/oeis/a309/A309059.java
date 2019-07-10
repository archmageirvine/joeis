package irvine.oeis.a309;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A309059.
 * @author Sean A. Irvine
 */
public class A309059 implements Sequence {

  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    if (mN.isProbablePrime()) {
      mN = mN.multiply(10).add(2);
      return Z.TWO;
    } else {
      mN = mN.multiply(10).add(1);
      return Z.ONE;
    }
  }
}
