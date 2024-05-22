package irvine.oeis.a063;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A063893 Numbers k such that the sum of proper divisors or aliquot parts of k^2 is a square.
 * @author Sean A. Irvine
 */
public class A063893 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      final Z n = Z.valueOf(++mN);
      final Z n2 = n.square();
      if (Functions.SIGMA1.z(n2).subtract(n2).isSquare()) {
        return n;
      }
    }
  }
}
