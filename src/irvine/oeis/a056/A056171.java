package irvine.oeis.a056;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a000.A000720;

/**
 * A056171 a(n) = pi(n) - pi(floor(n/2)), where pi is A000720.
 * @author Sean A. Irvine
 */
public class A056171 extends A000720 {

  private final Sequence mSeq = new A000720();
  private Z mA = Z.ZERO;
  private boolean mEven = true;

  @Override
  public Z next() {
    mEven = !mEven;
    if (mEven) {
      mA = mSeq.next();
    }
    return super.next().subtract(mA);
  }
}
