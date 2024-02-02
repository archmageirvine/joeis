package irvine.oeis.a067;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence2;

/**
 * A067620 a(n) = p^e, where p and e are the rounded means of the prime factors p_i and the exponents e_i, respectively, in the factorization n = p_1^e_1 * ... * p_r^e_r of n into distinct primes p_i. Each mean is rounded to the nearest integer, rounding up if there's a choice.
 * @author Sean A. Irvine
 */
public class A067620 extends Sequence2 {

  private long mN = 1;

  @Override
  public Z next() {
    final FactorSequence fs = Jaguar.factor(++mN);
    Z s = Z.ZERO;
    long e = 0;
    long c = 0;
    for (final Z p : fs.toZArray()) {
      s = s.add(p);
      e += fs.getExponent(p);
      ++c;
    }
    return s.add(c / 2).divide(c).pow((e + c / 2) / c);
  }
}
