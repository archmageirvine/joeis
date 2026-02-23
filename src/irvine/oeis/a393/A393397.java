package irvine.oeis.a393;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A393397 Irregular triangle read by rows: the n-th row gives the list of (n/d)^d where d is a divisor of n.
 * @author Sean A. Irvine
 */
public class A393397 extends Sequence1 {

  private Z mN = Z.ZERO;
  private Z[] mD = new Z[0];
  private int mM = 0;

  @Override
  public Z next() {
    if (++mM >= mD.length) {
      mN = mN.add(1);
      mD = Jaguar.factor(mN).divisorsSorted();
      mM = 0;
    }
    return mN.divide(mD[mM]).pow(mD[mM]);
  }
}
