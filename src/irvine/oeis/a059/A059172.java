package irvine.oeis.a059;

import irvine.factor.factor.Jaguar;
import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A059172 Numbers k such that k/rad(k) &gt; sqrt(k) where rad(k) is the largest squarefree number dividing k.
 * @author Sean A. Irvine
 */
public class A059172 extends Sequence1 {

  private long mN = 7;

  @Override
  public Z next() {
    while (true) {
      final Z rad = Jaguar.factor(++mN).squareFreeKernel();
      if (mN > rad.multiply(LongUtils.sqrt(mN)).longValueExact()) {
        return Z.valueOf(mN);
      }
    }
  }
}
