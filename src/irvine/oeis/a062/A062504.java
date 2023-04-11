package irvine.oeis.a062;

import irvine.math.z.Z;
import irvine.oeis.MemorySequence;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence0;
import irvine.oeis.a061.A061396;

/**
 * A062504 Triangle in which k-th row lists natural number values for the collection of riffs with k nodes.
 * @author Sean A. Irvine
 */
public class A062504 extends Sequence0 {

  protected final MemorySequence mA = new A062537();
  private final Sequence mLengths = new A061396();
  protected Z mN = Z.NEG_ONE;
  private long mRowLength = 0;
  private long mM = -1;
  protected int mT = 0;

  protected void step() {
    mRowLength = mLengths.next().longValueExact();
    mM = 0;
    mN = mN.add(1);
    mT = 0;
  }

  @Override
  public Z next() {
    if (++mM >= mRowLength) {
      step();
    }
    while (!mA.a(++mT).equals(mN)) {
      // do nothing
    }
    return Z.valueOf(mT);
  }
}
