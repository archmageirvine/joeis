package irvine.oeis.a072;

import irvine.math.z.Z;
import irvine.oeis.CachedSequence;
import irvine.oeis.Sequence0;

/**
 * A072700.
 * @author Sean A. Irvine
 */
public class A072727 extends Sequence0 {

  private final CachedSequence mA = new A072726();
  private int mN = -1;

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ZERO;
    }
    return mA.a(mN - Integer.highestOneBit(mN));
  }
}
