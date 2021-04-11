package irvine.oeis.a046;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence;

/**
 * A046513 Numbers with multiplicative persistence value 4.
 * @author Sean A. Irvine
 */
public class A046513 implements Sequence {

  private Z mN = Z.valueOf(76);

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      if (ZUtils.multiplicativePersistence(mN) == 4) {
        return mN;
      }
    }
  }
}
