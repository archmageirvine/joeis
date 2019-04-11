package irvine.oeis.a000;

import irvine.math.z.Z;
import irvine.oeis.a001.A001412;

/**
 * A000759 Number of n-step self-avoiding walks on cubic lattice ending at point with <code>x=0</code>.
 * @author Sean A. Irvine
 */
public class A000759 extends A001412 {

  // There is an asymmetry in this problem depending on whether the first step
  // is in the X direction.  A first step in Y or Z is "equivalent" and can
  // be counted with muplicity 2.  In both cases there is an additional
  // multiplicity of 2 for +1 versus -1.

  @Override
  protected long count(final int point) {
    return x(point) == BIAS ? 1 : 0;
  }

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ONE;
    }
    setPathLength(mN);
    setPathElement(0, ORIGIN);
    return Z.valueOf(2 * count(ORIGIN + X1, 1) + 4 * count(ORIGIN + Y1, 1));
  }
}
