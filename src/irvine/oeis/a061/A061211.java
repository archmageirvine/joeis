package irvine.oeis.a061;

import irvine.math.r.LambertW;
import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence1;

/**
 * A061211 Largest number m such that m is the n-th power of the sum of its digits.
 * @author Sean A. Irvine
 */
public class A061211 extends Sequence1 {

  // After Jean-Fran&ccedil;ois Alcover

  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    long max = 1;
    // todo this is the wrong branch of LambertW!
    final long limit = Math.round(Math.exp(-LambertW.w(-Math.log(10) / (4.5 * mN)))) + 900;
    System.out.println("lim=" + limit);
    for (long m = 1; m <= limit; ++m) {
      if (ZUtils.digitSum(Z.valueOf(m).pow(mN)) == m) {
        max = m;
      }
    }
    return Z.valueOf(max).pow(mN);
  }
}
