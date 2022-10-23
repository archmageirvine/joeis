package irvine.oeis.a051;

import java.util.ArrayList;

import irvine.math.q.HalfCentralBinomialSequence;
import irvine.math.q.Q;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A051050 Numerator of the probability that the convex hull of n+2 randomly chosen points in the unit ball B^n has n+1 vertices.
 * @author Sean A. Irvine
 */
public class A051050 extends Sequence0 {

  private final HalfCentralBinomialSequence mB = new HalfCentralBinomialSequence();
  private final ArrayList<Q> mOddHalfBinomial = new ArrayList<>();
  {
    mOddHalfBinomial.add(Q.ZERO);
  }
  private int mN = 0;

  private Q halfBinomial(final int n) {
    while (n >= mOddHalfBinomial.size()) {
      mOddHalfBinomial.add(mB.nextQ());
    }
    return mOddHalfBinomial.get(n);
  }

  protected Z select(final Q n) {
    return n.num();
  }

  private Q oddBinomial(final int n) {
    final int m = (n + 1) / 2;
    return halfBinomial(m);
  }

  @Override
  public Z next() {
    if ((++mN & 1) == 1) {
      final long n2 = (mN + 1) * (mN + 1);
      return select(new Q(Binomial.binomial(mN + 1, (mN + 1) / 2).pow(mN + 1).multiply(mN + 2),
        Binomial.binomial(n2, n2 / 2).shiftLeft(mN)));
    } else {
      return select(oddBinomial(mN + 1).pow(mN + 1).multiply(mN + 2)
        .divide(oddBinomial((mN + 1) * (mN + 1)).multiply(Z.ONE.shiftLeft(mN))));
    }
  }
}
