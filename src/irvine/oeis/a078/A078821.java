package irvine.oeis.a078;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A078800.
 * @author Sean A. Irvine
 */
public class A078821 extends Sequence0 {

  private final A078807 mA = new A078807();
  private final A078808 mB = new A078808();
  private int mN = 0;
  private int mM = -1;

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 0;
    }
    return mA.mB.get(mN, mM).add(mB.mB.get(mN, mN - mM));
  }
}
