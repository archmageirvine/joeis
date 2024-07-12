package irvine.oeis.a071;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A071321 Alternating sum of all prime factors of n; primes nondecreasing, starting with the least prime factor: A020639(n).
 * @author Sean A. Irvine
 */
public class A071321 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    final FactorSequence fs = Jaguar.factor(++mN);
    Z sum = Z.ZERO;
    boolean sign = false;
    for (final Z p : fs.toZArray()) {
      final int e = fs.getExponent(p);
      if ((e & 1) == 1) {
        sign = !sign;
        sum = sum.signedAdd(sign, p);
      }
    }
    return sum;
  }
}
