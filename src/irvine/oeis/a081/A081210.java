package irvine.oeis.a081;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A081210 In prime factorization of n replace each prime power p^e with the greatest squarefree number &lt;= p^e.
 * @author Sean A. Irvine
 */
public class A081210 extends Sequence1 {

  private long mN = 0;

  private Z f(Z n) {
    // n itself is not square free
    do {
      n = n.subtract(1);
    } while (!Predicates.SQUARE_FREE.is(n));
    return n;
  }

  @Override
  public Z next() {
    final FactorSequence fs = Jaguar.factor(++mN);
    Z prod = Z.ONE;
    for (final Z p : fs.toZArray()) {
      final int e = fs.getExponent(p);
      prod = prod.multiply(e == 1 ? p : f(p.pow(e)));
    }
    return prod;
  }
}
