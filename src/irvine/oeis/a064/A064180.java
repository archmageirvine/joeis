package irvine.oeis.a064;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.a002.A002808;

/**
 * A064180 Composite numbers k such that the sum of the proper divisors of k not including 1, (Chowla's function, A048050) and their product (A007956) are both perfect squares.
 * @author Sean A. Irvine
 */
public class A064180 extends A002808 {

  @Override
  public Z next() {
    while (true) {
      final Z c = super.next();
      final FactorSequence fs = Jaguar.factor(c);
      if (fs.sigma().subtract(c).subtract(1).isSquare() && fs.pod().divide(c).isSquare()) {
        return c;
      }
    }
  }
}
