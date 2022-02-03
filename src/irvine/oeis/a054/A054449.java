package irvine.oeis.a054;

import irvine.math.z.Z;

/**
 * A054449 Row sums of triangle A054448 (second member of partial row sums triangle family of Fibonacci convolution triangle).
 * @author Sean A. Irvine
 */
public class A054449 extends A054448 {

  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    Z t = Z.ZERO;
    for (int k = 0; k < mN; ++k) {
      t = t.add(super.next());
    }
    return t;
  }
}
