package irvine.oeis.a383;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A383962 Irregular triangle read by rows: T(n,k) is the index of the k-th odd divisor in the list of divisors of n, with n &gt;= 1, k &gt;= 1.
 * @author Sean A. Irvine
 */
public class A383962 extends Sequence1 {

  private long mN = 0;
  private int mM = 0;
  private Z[] mD = {};

  @Override
  public Z next() {
    while (true) {
      if (++mM >= mD.length) {
        mD = Jaguar.factor(++mN).divisorsSorted();
        mM = 0;
      }
      if (mD[mM].isOdd()) {
        return Z.valueOf(mM + 1);
      }
    }
  }
}

