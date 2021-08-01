package irvine.oeis.a049;

import irvine.math.z.Z;
import irvine.oeis.a007.A007305;

/**
 * A049468 Replace each fraction p/q in Farey tree A007305/A007306 with p+2q.
 * @author Sean A. Irvine
 */
public class A049468 extends A007305 {

  @Override
  protected Z select(final Z num, final Z den) {
    return num.add(den.multiply2());
  }
}
