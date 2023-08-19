package irvine.oeis.a065;

import irvine.math.z.Z;

/**
 * A065160 Reduced binary string self-substitutions: a(n) is obtained by substituting n for each 1-bit in the binary expansion of n, then dividing by n.
 * @author Sean A. Irvine
 */
public class A065160 extends A065157 {

  private long mN = 0;

  @Override
  public Z next() {
    return t(++mN, mN).divide(mN);
  }
}

