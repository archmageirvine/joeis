package irvine.oeis.a061;

import irvine.math.z.Z;

/**
 * A061690 Generalized Stirling numbers.
 * @author Sean A. Irvine
 */
public class A061690 extends A061691 {

  private int mN = 0;

  @Override
  public Z next() {
    return t(++mN, 3);
  }
}

