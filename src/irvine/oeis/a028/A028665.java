package irvine.oeis.a028;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A028665 Galois numbers for p=3; order of group AGL(n,3).
 * @author Sean A. Irvine
 */
public class A028665 extends Sequence0 {

  private int mN = start() - 1;

  protected Z power() {
    return Z.THREE;
  }

  protected int start() {
    return 0;
  }

  @Override
  public Z next() {
    if (++mN < 0) {
      return Z.ONE; // only needed for possinly bogus initial entry in A028666.
    }
    final Z pn = power().pow(mN);
    Z prod = pn;
    Z pk = Z.ONE;
    for (int k = 0; k < mN; ++k, pk = pk.multiply(power())) {
      prod = prod.multiply(pn.subtract(pk));
    }
    return prod;
  }
}
