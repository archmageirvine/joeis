package irvine.oeis.a109;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A109361 a(n) = Product_{k=1..n} sigma(k)/d(k), where sigma(k) = Sum_{j|k} j and d(k) = Sum_{j|k} 1. Set a(n) = 0 if the corresponding product is not an integer (e.g., for n=2 and n=10).
 * @author Georg Fischer
 */
public class A109361 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    Q prod = Q.ONE;
    for (int i = 2; i <= mN; ++i) {
      final FactorSequence fs = Jaguar.factor(i);
      prod = prod.multiply(fs.sigma()).divide(fs.sigma0());
    }
    return prod.isInteger() ? prod.num() : Z.ZERO;
  }
}
