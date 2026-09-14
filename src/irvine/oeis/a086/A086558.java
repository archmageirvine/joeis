package irvine.oeis.a086;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.factor.util.FactorUtils;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A086558 Smallest n-digit number beginning with n and having prime signature of n, or 0 if no such number exists.
 * @author Sean A. Irvine
 */
public class A086558 extends Sequence1 {

  private long mN = 0;
  private long mLim = 10;
  private long mDigits = 1;

  protected Z select(final Z u, final Z v) {
    return u;
  }

  @Override
  public Z next() {
    if (++mN == mLim) {
      mLim *= 10;
      ++mDigits;
    }

    // Special case p^e
    final Z v = Z.TEN.pow(mN - mDigits).multiply(mN);
    Z k = v;

    final FactorSequence fs = Jaguar.factor(mN);
    if (fs.omega() == 1) {
      final String s = String.valueOf(mN);
      final int e = fs.getExponent(fs.toZArray()[0]);
      Z r = k.root(e);
      while (true) {
        r = Functions.NEXT_PRIME.z(r);
        final Z re = r.pow(e);
        if (re.toString().startsWith(s)) {
          return select(re, v);
        }
      }
    }

    // To make this better we want an enumerator that directly makes numbers with a given signature

    // General case
    final Z sig = FactorUtils.leastPrimeSignature(mN);
    while (true) {
      if (FactorUtils.leastPrimeSignature(k).equals(sig)) {
        return select(k, v);
      }
      k = k.add(1);
    }
  }
}
