package irvine.oeis.a053;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A053291 Nonsingular n X n matrices over GF(4).
 * @author Sean A. Irvine
 */
public class A053291 extends Sequence0 {

  private int mN = -1;

  @Override
  public Z next() {
    final Z t = Z.ONE.shiftLeft(2 * ++mN);
    Z prod = Z.ONE;
    for (int k = 0; k < mN; ++k) {
      prod = prod.multiply(t.subtract(Z.ONE.shiftLeft(2 * k)));
    }
    return prod;
  }
}

