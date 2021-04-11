package irvine.oeis.a046;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence;

/**
 * A046517 Numbers with multiplicative persistence value 8.
 * @author Sean A. Irvine
 */
public class A046517 implements Sequence {

  private Z mN = Z.valueOf(2677888);

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      if (ZUtils.multiplicativePersistence(mN) == 8) {
        return mN;
      }
    }
  }
}
