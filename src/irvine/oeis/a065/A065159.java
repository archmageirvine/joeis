package irvine.oeis.a065;

import irvine.math.z.Z;

/**
 * A065159 Binary string self-substitutions: a(n) is obtained by substituting the binary expansion of n for each 1-bit in the binary expansion of n.
 * @author Sean A. Irvine
 */
public class A065159 extends A065157 {

  private long mN = -1;
  {
    setOffset(0);
  }

  @Override
  public Z next() {
    return t(++mN, mN);
  }
}

