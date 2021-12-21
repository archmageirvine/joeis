package irvine.oeis.a053;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A053293 Number of nonsingular n X n matrices over GF(7).
 * @author Sean A. Irvine
 */
public class A053293 implements Sequence {

  private int mN = -1;

  @Override
  public Z next() {
    final Z t = Z.SEVEN.pow(++mN);
    Z prod = Z.ONE;
    Z u = Z.ONE;
    for (int k = 0; k < mN; ++k, u = u.multiply(7)) {
      prod = prod.multiply(t.subtract(u));
    }
    return prod;
  }
}

