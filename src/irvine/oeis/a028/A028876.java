package irvine.oeis.a028;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A028876.
 * @author Sean A. Irvine
 */
public class A028876 implements Sequence {

  private Z mN = Z.THREE;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      if (mN.square().subtract(5).isProbablePrime()) {
        return mN;
      }
    }
  }
}
