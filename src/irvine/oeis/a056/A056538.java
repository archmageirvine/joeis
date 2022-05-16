package irvine.oeis.a056;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A056538 Irregular triangle read by rows: row n lists the divisors of n in decreasing order.
 * @author Sean A. Irvine
 */
public class A056538 implements Sequence {

  private long mN = 0;
  private int mM = 0;
  private Z[] mD = new Z[0];

  @Override
  public Z next() {
    if (--mM < 0) {
      mD = Jaguar.factor(++mN).divisorsSorted();
      mM = mD.length - 1;
    }
    return mD[mM];
  }
}
