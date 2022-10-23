package irvine.oeis.a069;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.oeis.a055.A055573;

/**
 * A069880 Number of terms in the simple continued fraction for Sum_{k=1..n} 1/k!.
 * @author Sean A. Irvine
 */
public class A069880 extends Sequence1 {

  private Z mF = Z.ONE;
  private Q mSum = Q.ZERO;
  private long mN = 0;

  @Override
  public Z next() {
    if (++mN > 1) {
      mF = mF.multiply(mN);
    }
    mSum = mSum.add(new Q(Z.ONE, mF));
    return Z.valueOf(A055573.continuedFractionLength(mSum));
  }
}
