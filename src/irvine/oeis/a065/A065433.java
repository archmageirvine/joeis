package irvine.oeis.a065;

import irvine.math.function.Functions;
import irvine.math.r.DoubleUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.string.StringUtils;

/**
 * A065433 Numbers n such that there exist x, y with n^2 = x! + y!.
 * @author Sean A. Irvine
 */
public class A065433 extends Sequence1 {

  private final boolean mVerbose = "true".equals(System.getProperty("oeis.verbose"));
  private int mN = 1;
  private int mM = 0;

  @Override
  public Z next() {
    while (true) {
      if (++mM > mN) {
        ++mN;
        mM = 1;
        if (mVerbose) {
          StringUtils.message("n >= 10^" + DoubleUtils.NF3.format(Functions.FACTORIAL.z(mN).log(10)));
        }
      }
      final Z sum = Functions.FACTORIAL.z(mN).add(Functions.FACTORIAL.z(mM));
      if (sum.isSquare()) {
        return sum.sqrt();
      }
    }
  }
}
