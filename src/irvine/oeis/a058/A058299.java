package irvine.oeis.a058;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A058299 Sum of terms in simple continued fraction for Sum_{k=0..n} 1/k!.
 * @author Sean A. Irvine
 */
public class A058299 implements Sequence {

  private Z mF = Z.ONE;
  private Q mSum = Q.ZERO;
  private long mN = -1;

  @Override
  public Z next() {
    if (++mN > 1) {
      mF = mF.multiply(mN);
    }
    mSum = mSum.add(new Q(Z.ONE, mF));
    return A058027.continuedFractionSum(mSum);
  }
}
