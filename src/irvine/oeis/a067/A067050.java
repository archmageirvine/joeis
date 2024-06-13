package irvine.oeis.a067;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;
import irvine.util.bumper.Bumper;
import irvine.util.bumper.BumperFactory;

/**
 * A067050 Triangle T(n,r), n&gt;=0, r=n, n-1, ..., 1, 0; where T(n,r) = product of all possible sums of r numbers chosen from [1..n].
 * @author Sean A. Irvine
 */
public class A067050 extends Sequence0 {

  private int mN = -1;
  private int mM = 0;
  private Bumper mBumper = null;

  @Override
  public Z next() {
    if (--mM < 0) {
      mM = ++mN;
      mBumper = BumperFactory.increasing(mN + 1);
    }
    Z prod = Z.ONE;
    if (mM > 0) {
      final int[] sum = new int[mM];
      for (int k = 0; k < sum.length; ++k) {
        sum[k] = k + 1;
      }
      do {
        prod = prod.multiply(Functions.SUM.l(sum));
      } while (mBumper.bump(sum));
    }
    return prod;
  }
}
