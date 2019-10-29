package irvine.oeis.a027;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a000.A000700;

/**
 * A027360.
 * @author Sean A. Irvine
 */
public class A027360 extends A027345 {

  private final Sequence mA = new A000700();
  private int mN = 0;
  private int mM = 0;
  private Z mS = mA.next();

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 1;
      mS = mA.next();
    }
    final Z res = mS;
    //mS = mS.add(distinctOddPartsMinimum(mN, mN + 1 - mM));
    mS = mS.subtract(distinctOddPartsMinimum(mN, mM));
    return res;
  }
}
