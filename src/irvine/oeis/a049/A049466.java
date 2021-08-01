package irvine.oeis.a049;

import irvine.math.z.Z;
import irvine.oeis.a007.A007305;

/**
 * A049466 Replace each fraction p/q in Farey tree A007305/A007306 with 3p+q.
 * @author Sean A. Irvine
 */
public class A049466 extends A007305 {

  @Override
  protected Z select(final Z num, final Z den) {
    return num.multiply(3).add(den);
  }
}
