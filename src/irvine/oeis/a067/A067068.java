package irvine.oeis.a067;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a003.A003418;

/**
 * A067037.
 * @author Sean A. Irvine
 */
public class A067068 extends Sequence1 {

  private final Sequence mA = new A003418().skip();
  private Z mT = Z.ONE;

  @Override
  public Z next() {
    mT = mT.multiply2();
    return mA.next().subtract(mT);
  }
}

