package irvine.oeis.a035;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A035093.
 * @author Sean A. Irvine
 */
public class A035093 implements Sequence {

  private Z mF = Z.ONE;
  private long mN = 0;

  @Override
  public Z next() {
    mF = mF.multiply(++mN);
    Z k = Z.ZERO;
    while (true) {
      k = k.add(1);
      if (k.multiply(mF).add(1).isProbablePrime()) {
        return k;
      }
    }
  }
}
