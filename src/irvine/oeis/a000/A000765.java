package irvine.oeis.a000;

import irvine.math.z.Z;
import irvine.oeis.a001.A001336;

/**
 * A000765 Number of <code>n-step self-avoiding</code> walks on f.c.c. lattice ending at point with <code>x = 0</code>.
 * @author Sean A. Irvine
 */
public class A000765 extends A001336 {

  // There is an asymmetry in this problem depending on whether the first step
  // is in the X direction.  A first step in Y or Z is "equivalent" and can
  // be counted with multiplicity 2.  In both cases there is an additional
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
    return Z.valueOf(8 * count(ORIGIN + X1 + Y1, 1) + 4 * count(ORIGIN + Y1 + 1, 1));
  }
}
