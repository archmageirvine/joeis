package irvine.oeis.a028;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A028879.
 * @author Sean A. Irvine
 */
public class A028879 implements Sequence {

  private Z mN = Z.TWO;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      if (mN.square().subtract(6).isProbablePrime()) {
        return mN;
      }
    }
  }
}
