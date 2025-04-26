package irvine.oeis.a077;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A077011 Triangle read by rows: T(n,k) = A002110(n)/prime(n+1-k), k = 1..n.
 * @author Sean A. Irvine
 */
public class A077011 extends Sequence1 {

  private long mN = 0;
  private long mM = 0;

  @Override
  public Z next() {
    if (++mM >= mN) {
      ++mN;
      mM = 0;
    }
    return Functions.PRIMORIAL_COUNT.z(mN).divide(Functions.PRIME.l(mN - mM));
  }
}

