package irvine.oeis.a233;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A233772 Triangle read by rows in which row n lists n together with the proper divisors of n multiplied by -1 in increasing order.
 * Copied from A056538.
 * @author Georg Fischer
 */
public class A233772 extends Sequence1 {

  private long mN = 0;
  private int mM = 0;
  private Z[] mD = new Z[0];
  private int mSign = 1;

  @Override
  public Z next() {
    if (--mM < 0) {
      mSign = 1;
      mD = Jaguar.factor(++mN).divisorsSorted();
      mM = mD.length - 1;
    }
    final Z result = mD[mM].multiply(mSign);
    mSign = -1;
    return result;
  }
}
