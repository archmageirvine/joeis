package irvine.oeis.a066;
// manually prodsim/prodsi at 2021-11-28 16:00

import irvine.factor.factor.Cheetah;
import irvine.factor.util.FactorSequence;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A066987 a(n) = Product_{i=2..n} sigma(i)/bigomega(i).
 * @author Georg Fischer
 */
public class A066987 implements Sequence {

  private int mN = 1;

  @Override
  public Z next() {
    ++mN;
    Q prod = Q.ONE;
    for (int i = 2; i <= mN; ++i) {
      final FactorSequence fs = Cheetah.factor(i);
      prod = prod.multiply(fs.sigma()).divide(fs.bigOmega());
    }
    return prod.num();
  }
}
