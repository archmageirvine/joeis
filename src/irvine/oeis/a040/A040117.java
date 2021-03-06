package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A040117.
 * @author Sean A. Irvine
 */
public class A040117 implements Sequence {

  private Z mN = Z.valueOf(-7);

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(12);
      if (mN.isProbablePrime()) {
        return mN;
      }
    }
  }
}
