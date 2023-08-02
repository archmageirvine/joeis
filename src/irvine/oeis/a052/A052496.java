package irvine.oeis.a052;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A052496 Nonsingular n X n matrices over GF(8).
 * @author Sean A. Irvine
 */
public class A052496 extends Sequence0 {

  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    Z prod = Z.ONE;
    final Z e = Z.ONE.shiftLeft(3L * mN);
    for (Z t = Z.ONE; !t.equals(e); t = t.shiftLeft(3)) {
      prod = prod.multiply(e.subtract(t));
    }
    return prod;
  }
}

