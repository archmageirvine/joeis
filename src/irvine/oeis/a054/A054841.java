package irvine.oeis.a054;

import irvine.factor.factor.Jaguar;
import irvine.factor.prime.Fast;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A054841 If n = 2^a * 3^b * 5^c * 7^d * ... then a(n) = a + 10 * b + 100 * c + 1000 * d + ... .
 * @author Sean A. Irvine
 */
public class A054841 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private long mN = 0;

  @Override
  public Z next() {
    if (++mN == 1) {
      return Z.ZERO;
    }
    final FactorSequence fs = Jaguar.factor(mN);
    final Z[] q = fs.toZArray();
    final Z max = q[q.length - 1];
    Z sum = Z.ZERO;
    Z t = Z.ONE;
    for (Z p = Z.TWO; p.compareTo(max) <= 0; p = mPrime.nextPrime(p), t = t.multiply(10)) {
      sum = sum.add(t.multiply(fs.getExponent(p)));
    }
    return sum;
  }
}
