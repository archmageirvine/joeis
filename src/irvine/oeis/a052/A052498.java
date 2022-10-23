package irvine.oeis.a052;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A052498 Number of nonsingular n X n matrices over GF(11).
 * @author Sean A. Irvine
 */
public class A052498 extends Sequence0 {

  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    Z prod = Z.ONE;
    final Z e = Z.valueOf(11).pow(mN);
    for (Z t = Z.ONE; !t.equals(e); t = t.multiply(11)) {
      prod = prod.multiply(e.subtract(t));
    }
    return prod;
  }
}

