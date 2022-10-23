package irvine.oeis.a066;
// manually prodsim/prodsi at 2021-11-28 16:00

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence2;

/**
 * A066988 a(n) = Product_{i=2..n} phi(i)/bigomega(i).
 * @author Georg Fischer
 */
public class A066988 extends Sequence2 {

  private int mN = 1;

  @Override
  public Z next() {
    ++mN;
    Q prod = Q.ONE;
    for (int i = 2; i <= mN; ++i) {
      final FactorSequence fs = Jaguar.factor(i);
      prod = prod.multiply(fs.phi()).divide(fs.bigOmega());
    }
    return prod.num();
  }
}
