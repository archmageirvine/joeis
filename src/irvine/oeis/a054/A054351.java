package irvine.oeis.a054;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a000.A000002;

/**
 * A054351 Successive generations of the Kolakoski sequence A000002.
 * @author Sean A. Irvine
 */
public class A054351 extends A000002 {

  private final StringBuilder mS = new StringBuilder();
  private final Sequence mRowLengths = new A054352();
  long mN = 0;

  @Override
  public Z next() {
    final long mRowLength = mRowLengths.next().longValueExact();
    while (mN < mRowLength) {
      mS.append(super.next());
      ++mN;
    }
    return new Z(mS);
  }
}
