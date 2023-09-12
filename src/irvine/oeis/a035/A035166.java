package irvine.oeis.a035;

import irvine.factor.factor.PrimeDivision;
import irvine.factor.util.FactorSequence;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A035166 Let d(m) = denominator of Sum_{k=1..m} 1/k^2 and consider f(m) = product of primes which appear to odd powers in d(m); sequence lists m such that f(m) is different from f(m-1).
 * @author Sean A. Irvine
 */
public class A035166 extends Sequence1 {

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
