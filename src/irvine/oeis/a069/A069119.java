package irvine.oeis.a069;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A069119 Numbers n such that n!*Sum_{i=1..n} 1/(i*2^i) is an integer.
 * @author Sean A. Irvine
 */
public class A069119 extends Sequence1 {

  private Q mA = Q.ZERO;
  private Z mF = Z.ONE;
  private int mN = 0;

  @Override
  public Z next() {
    while (true) {
      mF = mF.multiply(++mN);
      mA = mA.add(new Q(Z.ONE, Z.valueOf(mN).shiftLeft(mN)));
      if (mA.multiply(mF).isInteger()) {
        return Z.valueOf(mN);
      }
    }
  }
}

