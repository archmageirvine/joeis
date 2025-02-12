package irvine.oeis.a075;

import irvine.math.z.Z;

/**
 * A073101 Number of integer solutions (x,y,z) to 4/n = 1/x + 1/y + 1/z satisfying 0 &lt; x &lt; y &lt; z.
 * @author Sean A. Irvine
 */
public class A075246 extends A075245 {

  @Override
  protected Z select(final long x, final long y, final long z) {
    return Z.valueOf(y);
  }
}
