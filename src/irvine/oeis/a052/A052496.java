package irvine.oeis.a052;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A052496 Nonsingular n X n matrices over GF(8).
 * @author Sean A. Irvine
 */
public class A052496 implements Sequence {

  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    Z prod = Z.ONE;
    final Z e = Z.ONE.shiftLeft(3 * mN);
    for (Z t = Z.ONE; !t.equals(e); t = t.shiftLeft(3)) {
      prod = prod.multiply(e.subtract(t));
    }
    return prod;
  }
}

