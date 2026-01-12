package irvine.oeis.a083;

import irvine.math.z.Z;

/**
 * A083135 LCM of the terms of the n-th row of the triangle pertaining to A083130.
 * @author Sean A. Irvine
 */
public class A083135 extends A083130 {

  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    final Z t = super.next();
    Z lcm = t;
    for (int k = 1; k < mN; ++k) {
      lcm = lcm.lcm(t.add(k));
    }
    return lcm;
  }
}

