package irvine.oeis.a069;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A069118.
 * @author Sean A. Irvine
 */
public class A069118 extends Sequence1 {

  private Q mA = Q.ZERO;
  private Q mB = Q.ZERO;
  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      mA = mA.add(new Q(Z.ONE, mN.pow(4)));
      mB = mB.add(new Q(Z.ONE, mN.square()));
      final Z t = mA.den().divide(mB.den());
      if (t.isSquare()) {
        return mN;
      }
    }
  }
}

