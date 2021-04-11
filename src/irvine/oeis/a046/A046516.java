package irvine.oeis.a046;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence;

/**
 * A046516 Numbers with multiplicative persistence value 7.
 * @author Sean A. Irvine
 */
public class A046516 implements Sequence {

  private Z mN = Z.valueOf(68888);

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      if (ZUtils.multiplicativePersistence(mN) == 7) {
        return mN;
      }
    }
  }
}
