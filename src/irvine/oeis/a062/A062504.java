package irvine.oeis.a062;

import irvine.math.z.Z;
import irvine.oeis.MemorySequence;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence0;
import irvine.oeis.a061.A061396;

/**
 * A062501.
 * @author Sean A. Irvine
 */
public class A062504 extends Sequence0 {

  private final MemorySequence mA = new A062537();
  private final Sequence mLengths = new A061396();
  private Z mN = Z.NEG_ONE;
  private long mRowLength = 0;
  private long mM = -1;
  private int mT = 0;

  @Override
  public Z next() {
    if (++mM >= mRowLength) {
      mRowLength = mLengths.next().longValueExact();
      mM = 0;
      mN = mN.add(1);
      mT = 0;
    }
    while (!mA.a(++mT).equals(mN)) {
      // do nothing
    }
    return Z.valueOf(mT);
  }
}
