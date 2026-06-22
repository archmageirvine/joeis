package irvine.oeis.a395;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A395330 Symmetric array read by antidiagonals: A(n,k) = tau(n*k), where tau = A000005.
 * @author Sean A. Irvine
 */
public class A395330 extends Sequence1 {

  private long mN = 0;
  private long mM = -1;

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 0;
    }
    return Functions.SIGMA0.z((mN - mM + 1) * (mM + 1));
  }
}
