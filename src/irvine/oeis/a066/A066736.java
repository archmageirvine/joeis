package irvine.oeis.a066;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence1;
import irvine.util.string.StringUtils;

/**
 * A066736 Least number &gt; 1 such that the nonzero product of the digits of its n-th power is also an n-th power.
 * @author Sean A. Irvine
 */
public class A066736 extends Sequence1 {

  private final boolean mVerbose = "true".equals(System.getProperty("oeis.verbose"));
  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    long k = 1;
    while (true) {
      final Z prod = ZUtils.digitProduct(Z.valueOf(++k).pow(mN));
      if (!prod.isZero() && prod.root(mN).auxiliary() == 1) {
        return Z.valueOf(k);
      }
      if (mVerbose && k % 10000000 == 0) {
        StringUtils.message(mN + " search completed to " + k);
      }
    }
  }
}
