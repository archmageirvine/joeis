package irvine.oeis.a086;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a000.A000796;

/**
 * A086639 Write decimal expansion of Pi in triangular form; sequence gives left edge.
 * @author Sean A. Irvine
 */
public class A086639 extends Sequence1 {

  private final Sequence mPi = new A000796();
  private long mN = -2;

  @Override
  public Z next() {
    ++mN;
    for (long k = 0; k < mN; ++k) {
      mPi.next();
    }
    return mPi.next();
  }
}
