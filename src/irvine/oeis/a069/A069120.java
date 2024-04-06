package irvine.oeis.a069;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A069118.
 * @author Sean A. Irvine
 */
public class A069120 extends Sequence1 {

  private Q mA = Q.ZERO;
  private Z mF = Z.ONE;
  private int mN = 0;

  @Override
  public Z next() {
    while (true) {
      mF = mF.multiply(++mN);
      mA = mA.add(new Q(Z.ONE, Z.valueOf(mN).shiftLeft(mN)));
      final Q t = mA.multiply(mF);
      if (t.isInteger()) {
        return t.toZ();
      }
    }
  }
}

