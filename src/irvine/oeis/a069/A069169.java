package irvine.oeis.a069;

import irvine.math.MemoryFunction1;
import irvine.math.function.Functions;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.a018.A018252;

/**
 * A069169 Nonprimes k such that sigma(k)*Sum_{d|k} 1/sigma(d) is an integer.
 * @author Sean A. Irvine
 */
public class A069169 extends A018252 {

  private final MemoryFunction1<Z> mSigma = new MemoryFunction1<>() {
    @Override
    protected Z compute(final int key) {
      return Functions.SIGMA1.z(key);
    }
  };

  @Override
  public Z next() {
    while (true) {
      final Z n = super.next();
      final int nn = n.intValueExact();
      final Q s = Rationals.SINGLETON.sumdiv(nn, d -> new Q(Z.ONE, mSigma.get(d)));
      if (s.multiply(mSigma.get(nn)).isInteger()) {
        return n;
      }
    }
  }
}

