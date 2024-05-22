package irvine.oeis.a068;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A068572 Numbers n such that sigma(n) = product of the squares of the decimal digits of n.
 * @author Sean A. Irvine
 */
public class A068572 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      long m = ++mN;
      Z prod = Z.ONE;
      while (m != 0 && !prod.isZero()) {
        final long r = m % 10;
        m /= 10;
        prod = prod.multiply(r * r);
      }
      if (!prod.isZero() && Functions.SIGMA1.z(mN).equals(prod)) {
        return Z.valueOf(mN);
      }
    }
  }
}
