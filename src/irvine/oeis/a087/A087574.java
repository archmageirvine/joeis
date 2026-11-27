package irvine.oeis.a087;

import irvine.factor.factor.Jaguar;
import irvine.factor.factor.PrimeDivision;
import irvine.factor.util.FactorSequence;
import irvine.factor.util.FactorUtils;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A087574 a(1) = 1, then the smallest number such that the n-th partial concatenation has a prime signature of n.
 * @author Sean A. Irvine
 */
public class A087574 extends Sequence1 {

  private final PrimeDivision mTrialDivision = new PrimeDivision(100000);
  private final StringBuilder mS = new StringBuilder("1");
  private long mN = 0;

  @Override
  public Z next() {
    if (++mN == 1) {
      return Z.ONE;
    }
    final Z sig = FactorUtils.leastPrimeSignature(mN);
    final FactorSequence fs = Jaguar.factor(mN);
    if (fs.omega() == 1) {
      // only 1 prime factor
      final int e = fs.getExponent(fs.toZArray()[0]);
      Z t = new Z(mS);
      while (true) {
        t = t.multiply(10);
        Z u = t.root(e);
        while (u.pow(e).compareTo(t) <= 0) {
          u = Functions.NEXT_PRIME.z(u);
        }
        final String prefix = mS.toString();
        while (true) {
          final Z ue = u.pow(e);
          final String us = ue.toString();
          if (!us.startsWith(prefix)) {
            break;
          }
          if (us.charAt(mS.length()) != '0') {
            final String res = us.substring(mS.length());
            mS.append(res);
            return new Z(res);
          }
          u = Functions.NEXT_PRIME.z(u);
        }
      }
    }

    // General case
    Z t = new Z(mS);
    long lim = 1;
    long k = 0;
    while (true) {
      if (++k >= lim) {
        lim *= 10;
        t = t.multiply(10);
      }
      final Z tk = t.add(k);
      // We can eliminate quickly anything with more known factors than mN
      final FactorSequence td = new FactorSequence(tk);
      mTrialDivision.factor(td);
      if (td.omega() <= fs.omega()) {
        if (FactorUtils.leastPrimeSignature(tk).equals(sig)) {
          mS.append(k);
          return Z.valueOf(k);
        }
      }
    }
  }
}
