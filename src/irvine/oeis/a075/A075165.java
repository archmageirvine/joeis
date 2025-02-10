package irvine.oeis.a075;

import irvine.factor.factor.Jaguar;
import irvine.factor.prime.Fast;
import irvine.factor.util.FactorSequence;
import irvine.lisp.SExpression;
import irvine.math.MemoryFunction1;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A074598.
 * @author Sean A. Irvine
 */
public class A075165 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private int mN = 0;

  private final MemoryFunction1<SExpression> mT = new MemoryFunction1<>() {
    @Override
    protected SExpression compute(final int n) {
      final SExpression s = new SExpression();
      if (n > 1) {
        final FactorSequence fs = Jaguar.factor(mN);
        final Z[] f = fs.toZArray();
        Z p = f[f.length - 1];
        int e = fs.getExponent(p);
        while (p.compareTo(Z.ONE) > 0) {
          s.add(mT.get(e));
          p = mPrime.prevPrime(p);
          e = fs.getExponent(p) + 1;
        }
      }
      return s;
    }
  };

  @Override
  public Z next() {
    if (++mN == 1) {
      return Z.ZERO;
    }
    final SExpression s = mT.get(mN);
    return s.toZ();
  }
}
