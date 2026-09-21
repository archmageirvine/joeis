package irvine.oeis.a137;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A137526 Triangle read by rows: T(n,k) = [t^n*x^k] n! * (1-t^2) * exp(t*x).
 * @author Sean A. Irvine
 */
public class A137526 extends Sequence0 {

  private long mN = 0;
  private long mM = -1;

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 0;
    }
    return Functions.FACTORIAL.z(mN).divide(Functions.FACTORIAL.z(mM)).multiply((mN == mM ? 1 : 0) - ((mN == mM + 2) ? 1 : 0));
  }
}
