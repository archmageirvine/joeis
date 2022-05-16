package irvine.oeis.a050;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A050252 Number of digits in the prime factorization of n (counting terms of the form p^1 as p).
 * @author Sean A. Irvine
 */
public class A050252 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    if (++mN == 1) {
      return Z.ONE;
    }
    final FactorSequence fs = Jaguar.factor(mN);
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
