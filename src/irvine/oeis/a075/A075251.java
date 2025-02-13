package irvine.oeis.a075;

import irvine.math.z.Z;

/**
 * A075251 z-value of the solution (x,y,z) to 5/n = 1/x + 1/y + 1/z satisfying 0 &lt; x &lt; y &lt; z and having the largest z-value. The x and y components are in A075249 and A075250.
 * @author Sean A. Irvine
 */
public class A075251 extends A075249 {

  @Override
  protected Z select(final long x, final long y, final long z) {
    return Z.valueOf(z);
  }
}
