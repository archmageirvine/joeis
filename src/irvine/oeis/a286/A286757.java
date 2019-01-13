package irvine.oeis.a286;

import java.util.ArrayList;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.a002.A002829;

/**
 * A286757.
 * @author Sean A. Irvine
 */
public class A286757 extends A002829 {

  private final ArrayList<Z> mQ = new ArrayList<>();
  private int mN = 0;
  private Z mA = Z.ZERO;
  private Z mB = Z.ZERO;

  private Z q(final int n) {
    while (n >= mQ.size()) {
      mQ.add(super.next());
    }
    if (n < 0) {
      return Z.ZERO;
    }
    return mQ.get(n);
  }

  @Override
  public Z next() {
    if (++mN > 1) {
      final long p2 = 2L * mN;
      final Z t = mB.multiply(Binomial.binomial(p2, 2)).multiply2()
        .add(mA.multiply(Binomial.binomial(p2, 4)).multiply(12))
        .add(q(mN - 1).multiply(Binomial.binomial(p2, 3)).multiply(6))
        .add(q(mN - 2).multiply(Binomial.binomial(p2, 5)).multiply(60))
        .add(q(mN - 3).multiply(Binomial.binomial(p2, 7)).multiply(1260));
      mA = mB;
      mB = t;
    }
    return mN == 2 ? Z.FOUR : mB;
  }
}

