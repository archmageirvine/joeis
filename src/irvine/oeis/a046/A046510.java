package irvine.oeis.a046;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence;

/**
 * A046510 Numbers with multiplicative persistence value 1.
 * @author Sean A. Irvine
 */
public class A046510 implements Sequence {

  private Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      if (ZUtils.multiplicativePersistence(mN) <= 1) {
        return mN;
      }
    }
  }
}
