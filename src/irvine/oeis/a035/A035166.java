package irvine.oeis.a035;

import irvine.factor.factor.PrimeDivision;
import irvine.factor.util.FactorSequence;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A035166.
 * @author Sean A. Irvine
 */
public class A035166 implements Sequence {

  private Q mSum = Q.ZERO;
  private long mN = 0;
  private Z mPrev = Z.ZERO;
  private final PrimeDivision mFactor = new PrimeDivision();

  @Override
  public Z next() {
    while (true) {
      final Z n = Z.valueOf(++mN);
      mSum = mSum.add(new Q(Z.ONE, n.square()));
      final FactorSequence fs = mFactor.factorize(mSum.den());
      Z prod = Z.ONE;
      for (final Z p : fs.toZArray()) {
        if ((fs.getExponent(p) & 1) == 1) {
          prod = prod.multiply(p);
        }
      }
      if (!prod.equals(mPrev)) {
        mPrev = prod;
        return n;
      }
    }
  }
}
