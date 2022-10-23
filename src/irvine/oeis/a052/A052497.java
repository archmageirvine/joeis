package irvine.oeis.a052;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A052497 Nonsingular n X n matrices over GF(9).
 * @author Sean A. Irvine
 */
public class A052497 extends Sequence0 {

  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    Z prod = Z.ONE;
    final Z e = Z.NINE.pow(mN);
    for (Z t = Z.ONE; !t.equals(e); t = t.multiply(9)) {
      prod = prod.multiply(e.subtract(t));
    }
    return prod;
  }
}

