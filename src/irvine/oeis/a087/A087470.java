package irvine.oeis.a087;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.util.array.LongDynamicLongArray;

/**
 * A087470 a(n) = number of the row (counting from initial row 1) of the array R in A087468 that contains n.
 * @author Sean A. Irvine
 */
public class A087470 extends Sequence1 {

  private final Sequence mS = new A087468();
  private final LongDynamicLongArray mA = new LongDynamicLongArray();
  private int mN = 0;
  private int mM = -1;
  private long mR = 0;

  @Override
  public Z next() {
    ++mR;
    while (mA.get(mR) == 0) {
      if (++mM > mN) {
        ++mN;
        mM = 0;
      }
      mA.set(mS.next().longValueExact(), mM + 1);
    }
    return Z.valueOf(mA.get(mR));
  }
}
