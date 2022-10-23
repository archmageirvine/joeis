package irvine.oeis.a054;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A054201 a(n) = (n-1)! * Sum_{k=1..n} k^k/k!.
 * @author Sean A. Irvine
 */
public class A054201 extends Sequence1 {

  private int mN = 0;
  private Z mF = Z.ONE;
  private Q mSum = Q.ZERO;

  @Override
  public Z next() {
    final Z oldF = mF;
    if (++mN > 1) {
      mF = mF.multiply(mN);
    }
    mSum = mSum.add(new Q(Z.valueOf(mN).pow(mN), mF));
    return mSum.multiply(oldF).toZ();
  }
}

