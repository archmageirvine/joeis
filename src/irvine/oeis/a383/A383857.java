package irvine.oeis.a383;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a002.A002464;

/**
 * A383863.
 * @author Sean A. Irvine
 */
public class A383857 extends Sequence1 {

  private final Sequence mB = new A002464().skip();
  private Z mT = mB.next();
  private long mN = -1;

  @Override
  public Z next() {
    final Z b = mT.multiply(++mN);
    mT = mB.next();
    return mT.subtract(b);
  }
}

