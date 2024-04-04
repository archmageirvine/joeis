package irvine.oeis.a069;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.factorial.MemoryFactorial;
import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.Sequence2;
import irvine.oeis.a002.A002034;

/**
 * A069098.
 * @author Sean A. Irvine
 */
public class A069098 extends Sequence2 {

  // After Navin Kashyap

  private final DirectSequence mKempner = new A002034();
  private int mN = 1;

  private int b(final Z p, final int q, final int j) {
    Z jf = MemoryFactorial.SINGLETON.factorial(j);
    int cnt = 0;
    while (cnt < q && jf.mod(p).isZero()) {
      ++cnt;
      jf = jf.divide(p);
    }
    return cnt;
  }

  private Z bigN(final long s, final Z p, final int q) {
    long sum = 0;
    for (int j = 0; j < s; ++j) {
      sum += b(p, q, j);
    }
    return p.pow(sum);
  }

  @Override
  public Z next() {
    final FactorSequence fs = Jaguar.factor(++mN);
    if (fs.bigOmega() == 1) {
      return Z.ONE; // mN is prime
    }
    final int s = mKempner.a(mN).intValueExact();
    Z prod = Z.ONE;
    for (final Z p : fs.toZArray()) {
      prod = prod.multiply(bigN(s, p, fs.getExponent(p)));
    }
    return prod;
  }
}

