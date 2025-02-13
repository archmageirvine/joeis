package irvine.oeis.a075;

import irvine.math.z.Z;

/**
 * A075247 Largest possible z-value of an integer solution (x,y,z) to 4/n = 1/x + 1/y + 1/z satisfying 0 &lt; x &lt; y &lt; z. The x and y components are in A075245 and A075246.
 * @author Sean A. Irvine
 */
public class A075247 extends A075245 {

  @Override
  protected Z select(final long x, final long y, final long z) {
    return Z.valueOf(z);
  }
}
