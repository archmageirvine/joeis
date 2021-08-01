package irvine.oeis.a049;

import irvine.math.z.Z;
import irvine.oeis.a007.A007305;

/**
 * A049467 Replace each fraction p/q in Farey tree A007305/A007306 with 4p+q.
 * @author Sean A. Irvine
 */
public class A049467 extends A007305 {

  @Override
  protected Z select(final Z num, final Z den) {
    return num.multiply(4).add(den);
  }
}
