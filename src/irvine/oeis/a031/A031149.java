package irvine.oeis.a031;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A031149 Numbers n such that n^2 with last digit deleted is still a perfect square.
 * @author Sean A. Irvine
 */
public class A031149 implements Sequence {

  // After Robert Israel
  private static final ComputableReals REALS = ComputableReals.SINGLETON;
  private static final CR S = CR.TEN.sqrt();
  private static final CR E = S.multiply(6);
  private static final CR CR19 = CR.valueOf(19);
  private static final CR E1 = CR19.add(E);
  private static final CR E2 = CR19.subtract(E);
  private static final CR U = S.divide(CR.TWO);
  private static final CR S1 = CR.TWO.add(U);
  private static final CR S2 = CR.TWO.subtract(U);
  private static final CR T = CR.valueOf(new Q(13, 2));
  private static final CR V = S.multiply(CR.TWO);
  private static final CR T1 = T.add(V);
  private static final CR T2 = T.subtract(V);
  private static final CR W = CR.valueOf(new Q(7, 2));
  private static final CR W1 = W.add(S);
  private static final CR W2 = W.subtract(S);
  private static final CR R = CR.EIGHT;
  private static final CR Y = U.multiply(CR.FIVE);
  private static final CR Z1 = R.add(Y);
  private static final CR Z2 = R.subtract(Y);

  private int mN = 0;

  @Override
  public Z next() {
    if (++mN < 2) {
      return Z.valueOf(mN - 1);
    }
    final int k = mN / 7;
    switch (mN % 7) {
      case 0:
        return REALS.pow(E1, k - 1).multiply(T1).add(REALS.pow(E2, k - 1).multiply(T2)).toZ();
      case 1:
        return REALS.pow(E1, k - 1).multiply(Z1).add(REALS.pow(E2, k - 1).multiply(Z2)).toZ();
      case 2:
        return REALS.pow(E1, k).add(REALS.pow(E2, k)).divide(CR.TWO).toZ();
      case 3:
        return REALS.pow(E1, k).add(REALS.pow(E2, k)).toZ();
      case 4:
        return REALS.pow(E1, k).add(REALS.pow(E2, k)).multiply(CR.THREE).divide(CR.TWO).toZ();
      case 5:
        return REALS.pow(E1, k).multiply(S1).add(REALS.pow(E2, k).multiply(S2)).toZ();
      case 6:
        return REALS.pow(E1, k).multiply(W1).add(REALS.pow(E2, k).multiply(W2)).toZ();
      default:
        throw new RuntimeException();
    }
  }
}
