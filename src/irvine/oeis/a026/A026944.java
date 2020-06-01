package irvine.oeis.a026;

import irvine.math.z.Z;
import irvine.oeis.a002.A002067;

/**
 * A026944 E.g.f. is inverse function to <code>y -&gt;</code> integral from 0 to y of <code>exp(-s^2)</code>.
 * @author Sean A. Irvine
 */
public class A026944 extends A002067 {

  private int mN = -1;

  @Override
  public Z next() {
    return super.next().shiftLeft(++mN);
  }
}
