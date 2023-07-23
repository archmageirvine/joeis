package irvine.oeis.a054;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a000.A000002;

/**
 * A054350 Triangular array whose rows are successive generations of the Kolakoski sequence A000002.
 * @author Sean A. Irvine
 */
public class A054350 extends A000002 {

  {
    setOffset(0);
  }

  private final Sequence mRowLengths = new A054352();
  private long mRowLength = mRowLengths.next().longValueExact();
  private long mM = -1;

  @Override
  public Z next() {
    if (++mM == mRowLength) {
      mRowLength = mRowLengths.next().longValueExact();
      // Underlying Kolakoski generator is using a different rule
      while (mLimit < mRowLength) {
        rewrite();
      }
      mM = 0;
    }
    return isSet(mM) ? Z.TWO : Z.ONE;
  }
}
