package irvine.oeis.a394;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A394898 Irregular triangle read by rows: T(n,k) = A027750(n,k) - 2*A027750(n,k-1) with 2 &lt;= k &lt;= A000005(n) and T(n,1) = 1.
 * @author Sean A. Irvine
 */
public class A394898 extends Sequence1 {

  private long mN = 0;
  private Z[] mList = new Z[0];
  private int mM = 0;

  @Override
  public Z next() {
    if (++mM >= mList.length) {
      mList = Jaguar.factor(++mN).divisorsSorted();
      mM = 0;
    }
    return mM == 0 ? Z.ONE : mList[mM].subtract(mList[mM - 1].multiply2());
  }
}
