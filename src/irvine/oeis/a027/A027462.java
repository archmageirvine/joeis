package irvine.oeis.a027;

import irvine.math.z.Z;

/**
 * A027462 a(n) is the numerator of (-1/6) * Integral_{x=0..1} x^n * log^3(1-x).
 * @author Sean A. Irvine
 */
public class A027462 extends A027448 {

  private long mN = -1;

  @Override
  public Z next() {
    step();
    return mMatrix.get(++mN, 0).num();
  }
}
