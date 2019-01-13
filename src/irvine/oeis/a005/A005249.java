package irvine.oeis.a005;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A005249.
 * @author Sean A. Irvine
 */
public class A005249 implements Sequence {

  private int mN = -1;

  @Override
  public Z next() {
    final Z n = Z.valueOf(++mN);
    final Z n2 = n.square();
    Z prod = n.pow(mN);
    for (int k = 1; k < mN; ++k) {
      prod = prod.multiply(n2.subtract((long) k * k).pow(mN - k));
    }
    Z f = Z.ONE;
    for (int k = 2; k < mN; ++k) {
      f = f.multiply((long) k * k);
      prod = prod.divide(f);
    }
    return prod;
  }
}

