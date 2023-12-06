package irvine.oeis.a067;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence1;

/**
 * A067081.
 * @author Sean A. Irvine
 */
public class A067173 extends Sequence1 {

  private long mN = 1;

  @Override
  public Z next() {
    while (true) {
      long t = ZUtils.digitProduct(++mN);
      if (t != 0) {
        for (final Z p : Jaguar.factor(mN).toZArray()) {
          t -= p.longValue();
        }
        if (t == 0) {
          return Z.valueOf(mN);
        }
      }
    }
  }
}
