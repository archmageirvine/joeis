package irvine.oeis.a075;

import irvine.math.z.Z;

/**
 * A075262 z-value of the solution (x,y,z) to 3/(2n+1) = 1/x + 1/y + 1/z satisfying 0 &lt; x &lt; y &lt; z, odd x, y, z and having the largest z-value. The x and y components are in A075260 and A075261.
 * @author Sean A. Irvine
 */
public class A075262 extends A075260 {

  @Override
  protected Z select(final long x, final long y, final long z) {
    return Z.valueOf(z);
  }
}
