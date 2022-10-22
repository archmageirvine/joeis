package irvine.oeis.a352;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence1;

/**
 * A352532 Numbers with multiplicative persistence value 11.
 * @author Georg Fischer
 */
public class A352532 extends Sequence1 {

  private Z mN = Z.valueOf(277777788888898L);

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      if (ZUtils.multiplicativePersistence(mN) == 11) {
        return mN;
      }
    }
  }
}
