package irvine.oeis.a026;

import irvine.math.z.Z;
import irvine.oeis.a002.A002067;

/**
 * A026944 E.g.f. is inverse function to y -&gt; integral from 0 to y of exp(-s^2).
 * @author Sean A. Irvine
 */
public class A026944 extends A002067 {

  private int mN = -1;

  @Override
  public Z next() {
    return super.next().shiftLeft(++mN);
  }
}
