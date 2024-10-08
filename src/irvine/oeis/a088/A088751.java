package irvine.oeis.a088;

import irvine.factor.prime.Fast;
import irvine.math.cr.CR;
import irvine.math.cr.ZPolynomialFunction;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A088751 Decimal expansion of -x, the real root of the equation 0 = 1 + Sum_{k&gt;=1} prime(k) x^k. The inverse of Backhouse's constant (A072508).
 * @author Sean A. Irvine
 */
public class A088751 extends DecimalExpansionSequence {

  private static final int INCREMENT = 100;

  private static CR buildCR() {
    return new CR() {
      private final Fast mPrime = new Fast();
      private int mLo = INCREMENT;

      private Polynomial<Z> getPoly(final int m) {
        final long[] coeffs = new long[m];
        coeffs[0] = 1;
        long p = 2;
        for (int k = 1; k < coeffs.length; ++k, p = mPrime.nextPrime(p)) {
          coeffs[k] = (k & 1) == 0 ? p : -p;
        }
        return Polynomial.create(coeffs);
      }

      private CR getRoot(final int m) {
        return new ZPolynomialFunction(getPoly(m)).inverseMonotone(CR.HALF, CR.ONE).execute(CR.ZERO);
      }

      private CR mRootLo = getRoot(mLo);
      private CR mRootHi = getRoot(mLo + INCREMENT);

      @Override
      protected Z approximate(final int precision) {
        while (!mRootLo.getApprox(precision).equals(mRootHi.getApprox(precision))) {
          mLo += INCREMENT;
          mRootLo = mRootHi;
          mRootHi = getRoot(mLo + INCREMENT);
        }
        return mRootHi.getApprox(precision);
      }
    };
  }

  /** Construct the sequence. */
  public A088751() {
    super(0, buildCR());
  }
}
