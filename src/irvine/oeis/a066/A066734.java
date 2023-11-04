package irvine.oeis.a066;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence1;

/**
 * A036839.
 * @author Sean A. Irvine
 */
public class A066734 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      final Z prod = ZUtils.digitProduct(Z.valueOf(++mN).pow(4));
      if (!prod.isZero() && prod.root(4).auxiliary() == 1) {
        return Z.valueOf(mN);
      }
    }
  }
}
