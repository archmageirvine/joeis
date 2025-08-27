package irvine.oeis.a079;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a002.A002808;

/**
 * A079775 Triangle in A079774 read by rows.
 * @author Sean A. Irvine
 */
public class A079775 extends A002808 {

  private int mN = 0;
  private int mM = 0;
  private Z mA = null;
  private Z mT = null;

  @Override
  public Z next() {
    if (++mM >= mN) {
      ++mN;
      mA = super.next();
      mT = mA;
      mM = 0;
    } else {
      do {
        mT = mT.add(1);
      } while (Functions.GCD.z(mA, mT).isOne());
      mA = Functions.GCD.z(mA, mT);
    }
    return mT;
  }
}

