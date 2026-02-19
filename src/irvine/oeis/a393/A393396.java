package irvine.oeis.a393;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A393396 allocated for Stefano Spezia.
 * @author Sean A. Irvine
 */
public class A393396 extends Sequence1 {

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
    return mD[mM].pow(mN.divide(mD[mM]));
  }
}
