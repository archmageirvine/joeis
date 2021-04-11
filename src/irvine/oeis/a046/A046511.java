package irvine.oeis.a046;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence;

/**
 * A046511 Numbers with multiplicative persistence value 2.
 * @author Sean A. Irvine
 */
public class A046511 implements Sequence {

  private Z mN = Z.valueOf(24);

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      if (ZUtils.multiplicativePersistence(mN) == 2) {
        return mN;
      }
    }
  }
}
