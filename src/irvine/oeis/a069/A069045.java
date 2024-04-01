package irvine.oeis.a069;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A069044.
 * @author Sean A. Irvine
 */
public class A069045 extends Sequence1 {

  private Q mA = Q.ZERO;
  private Q mB = Q.ZERO;
  private long mN = 0;

  @Override
  public Z next() {
    mA = mA.add(new Q(Z.ONE, Z.valueOf(++mN).pow(4)));
    mB = mB.add(new Q(1, mN));
    return mA.den().divide(mB.den());
  }
}

