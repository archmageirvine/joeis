package irvine.oeis.a065;

import irvine.math.z.Z;

/**
 * A065158 Table of reduced binary string substitutions: a(i,j) is obtained by substituting i for each 1-bit in j, then dividing by i.
 * @author Sean A. Irvine
 */
public class A065158 extends A065157 {

  @Override
  public Z next() {
    return super.next().divide(mN - mM);
  }
}

