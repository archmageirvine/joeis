package irvine.oeis.a395;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.a001.A001358;
import irvine.util.array.DynamicArray;
import irvine.util.string.StringUtils;

/**
 * A395284 Smallest semiprime that produces a chain of exactly n semiprimes when repeatedly replacing m=p*q (with primes p&lt;=q) by the decimal concatenation of p followed by q, stopping when the result is not semiprime.
 * @author Sean A. Irvine
 */
public class A395284 extends A001358 {

  private final boolean mVerbose = "true".equals(System.getProperty("oeis.verbose"));
  private final DynamicArray<Z> mFirsts = new DynamicArray<>();
  private int mN = 0;

  private int count(Z t) {
    int cnt = 0;
    while (true) {
      final FactorSequence fs = Jaguar.factor(t);
      if (!fs.isSemiprime()) {
        return cnt;
      }
      ++cnt;
      final Z[] p = fs.toZArray();
      if (p.length == 1) {
        final String s = p[0].toString();
        t = new Z(s + s);
      } else {
        t = new Z(p[0].toString() + p[1].toString());
      }
    }
  }

  @Override
  public Z next() {
    ++mN;
    while (mFirsts.get(mN) == null) {
      final Z t = super.next();
      final int cnt = count(t);
      if (mFirsts.get(cnt) == null) {
        mFirsts.set(cnt, t);
        if (mVerbose) {
          StringUtils.message("Solution for n=" + cnt + " is " + t);
        }
      }
    }
    return mFirsts.get(mN);
  }
}

