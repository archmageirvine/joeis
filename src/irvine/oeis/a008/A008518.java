package irvine.oeis.a008;

import irvine.math.z.Z;

/**
 * A008518 Triangle of Eulerian numbers with rows multiplied by 1 + x.
 * @author Sean A. Irvine
 */
public class A008518 extends A008292 {

  private long mN = 0;
  private long mM = 1;

  @Override
  public Z next() {
    if (++mM > mN) {
      mM = 1;
      if (++mN == 1) {
        return Z.ONE;
      }
    }
    return get(mN - 1, mM).add(get(mN - 1, mM - 1));
  }
}
