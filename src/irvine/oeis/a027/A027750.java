package irvine.oeis.a027;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A027750 Triangle read by rows in which row n lists the divisors of n.
 * @author Sean A. Irvine
 */
public class A027750 extends Sequence1 {

  private long mN = 0;
  private Z[] mList = new Z[0];
  private int mM = 0;

  @Override
  public Z next() {
    if (++mM >= mList.length) {
      if (++mN == 1) {
        return Z.ONE;
      }
      mList = Jaguar.factor(mN).divisorsSorted();
      mM = 0;
    }
    return mList[mM];
  }
}
