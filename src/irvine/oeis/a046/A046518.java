package irvine.oeis.a046;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence;

/**
 * A046518 Numbers with multiplicative persistence value 9.
 * @author Sean A. Irvine
 */
public class A046518 implements Sequence {

  private Z mN = Z.valueOf(26888998);

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      if (ZUtils.multiplicativePersistence(mN) == 9) {
        return mN;
      }
    }
  }
}
