package irvine.oeis.a072;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A072327 Numbers k such that k^2 is a term of A072510.
 * @author Sean A. Irvine
 */
public class A072327 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      Z prod = Z.ONE;
      final Z n = Z.valueOf(++mN);
      final Z n2 = n.square();
      for (final Z d : Jaguar.factor(n2).divisorsSorted()) {
        prod = prod.multiply(d);
        if (prod.compareTo(n2) >= 0) {
          if (prod.equals(n2)) {
            return n;
          }
          break;
        }
      }
    }
  }
}
