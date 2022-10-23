package irvine.oeis.a059;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A059415 Numerators of sequence arising from Apery's proof that zeta(3) is irrational.
 * @author Sean A. Irvine
 */
public class A059415 extends Sequence0 {

  private static final Z Z34 = Z.valueOf(34);
  private int mN = -2;
  private Q mA = Q.ZERO;
  private Q mB = Q.SIX;

  protected Z select(final Q n) {
    return n.num();
  }

  @Override
  public Z next() {
    if (++mN == -1) {
      return select(mA);
    } else if (mN > 0) {
      final Q t = mB.multiply(Z34.multiply(mN).add(51).multiply(mN).add(27).multiply(mN).add(5))
        .subtract(mA.multiply(Z.valueOf(mN).pow(3)))
        .divide(Z.valueOf(mN + 1).pow(3));
      mA = mB;
      mB = t;
    }
    return select(mB);
  }
}
