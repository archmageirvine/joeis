package irvine.oeis.a069;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A069118 Let D(n,s) denotes the denominator of sum(k=1,n,1/k^s); sequence gives values of n such that D(n,4)/D(n,2) is a perfect square.
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

