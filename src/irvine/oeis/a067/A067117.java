package irvine.oeis.a067;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a000.A000142;

/**
 * A067102.
 * @author Sean A. Irvine
 */
public class A067117 extends Sequence1 {

  private long mN = 0;
  private final StringBuilder mX = new StringBuilder();
  private final Sequence mF = new A000142().skip();

  @Override
  public Z next() {
    mX.append(++mN);
    return new Z(mX).divide(mF.next());
  }
}
