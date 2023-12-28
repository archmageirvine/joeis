package irvine.oeis.a067;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence2;

/**
 * A067629 The average of the prime factors of n, rounded off to the nearest integer (rounding up if there's a choice), with each factor weighted according to its frequency of occurrence in the prime factorization.
 * @author Sean A. Irvine
 */
public class A067629 extends Sequence2 {

  private long mN = 1;

  @Override
  public Z next() {
    final FactorSequence fs = Jaguar.factor(++mN);
    Z s = Z.ZERO;
    long c = 0;
    for (final Z p : fs.toZArray()) {
      final int e = fs.getExponent(p);
      s = s.add(p.multiply(e));
      c += e;
    }
    return s.add(c / 2).divide(c);
  }
}
