package irvine.oeis.a027;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A027751 Irregular triangle read by rows in which row n lists the proper divisors of n (those divisors of n which are &lt; n), with the first row {1} by convention.
 * @author Sean A. Irvine
 */
public class A027751 extends Sequence1 {

  private long mN = 0;
  private Z[] mList = new Z[0];
  private int mM = 0;

  @Override
  public Z next() {
    if (++mM >= mList.length - 1) {
      if (++mN == 1) {
        return Z.ONE;
      }
      mList = Jaguar.factor(mN).divisorsSorted();
      mM = 0;
    }
    return mList[mM];
  }
}
