package irvine.oeis.a061;

import irvine.math.z.Z;

/**
 * A061689 Generalized Stirling numbers.
 * @author Sean A. Irvine
 */
public class A061689 extends A061691 {

  private int mN = 2;

  @Override
  public Z next() {
    return t(++mN, mN - 2);
  }
}

