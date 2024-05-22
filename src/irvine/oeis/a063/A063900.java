package irvine.oeis.a063;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A063900 Numbers k such that sum of proper divisors or aliquot parts of k^2 (excluding 1) is a square, or A048050(k^2) is a square.
 * @author Sean A. Irvine
 */
public class A063900 extends Sequence1 {

  private long mN = 865;

  @Override
  public Z next() {
    while (true) {
      final Z n = Z.valueOf(++mN);
      final Z n2 = n.square();
      if (Functions.SIGMA1.z(n2).subtract(n2).subtract(1).isSquare()) {
        return n;
      }
    }
  }
}
