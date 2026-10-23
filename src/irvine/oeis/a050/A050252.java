package irvine.oeis.a050;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.Sequence1;

/**
 * A050252 Number of digits in the prime factorization of n (counting terms of the form p^1 as p).
 * @author Sean A. Irvine
 */
public class A050252 extends Sequence1 implements DirectSequence {

  private long mN = 0;

  @Override
  public Z next() {
    return a(++mN);
  }

  @Override
  public Z a(final Z n) {
    if (n.isOne()) {
      return Z.ONE;
    }
    final FactorSequence fs = Jaguar.factor(n);
    long cnt = 0;
    for (final Z p : fs.toZArray()) {
      cnt += p.toString().length();
      final int e = fs.getExponent(p);
      if (e > 1) {
        cnt += Long.toString(e).length();
      }
    }
    return Z.valueOf(cnt);
  }

  @Override
  public Z a(final long n) {
    if (n == 1) {
      return Z.ONE;
    }
    final FactorSequence fs = Jaguar.factor(n);
    long cnt = 0;
    for (final Z p : fs.toZArray()) {
      cnt += p.toString().length();
      final int e = fs.getExponent(p);
      if (e > 1) {
        cnt += Long.toString(e).length();
      }
    }
    return Z.valueOf(cnt);
  }

}
