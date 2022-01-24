package irvine.oeis.a054;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A054200.
 * @author Sean A. Irvine
 */
public class A054201 implements Sequence {

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

