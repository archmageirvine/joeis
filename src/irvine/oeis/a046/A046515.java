package irvine.oeis.a046;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence1;

/**
 * A046515 Numbers with multiplicative persistence value 6.
 * @author Sean A. Irvine
 */
public class A046515 extends Sequence1 {

  private Z mN = Z.valueOf(6787);

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      if (ZUtils.multiplicativePersistence(mN) == 6) {
        return mN;
      }
    }
  }
}
