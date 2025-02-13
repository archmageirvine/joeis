package irvine.oeis.a075;

import irvine.math.z.Z;

/**
 * A075246 y-value of the solution (x,y,z) to 4/n = 1/x + 1/y + 1/z satisfying 0 &lt; x &lt; y &lt; z and having the largest z-value. The x and z components are in A075245 and A075247.
 * @author Sean A. Irvine
 */
public class A075246 extends A075245 {

  @Override
  protected Z select(final long x, final long y, final long z) {
    return Z.valueOf(y);
  }
}
