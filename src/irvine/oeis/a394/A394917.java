package irvine.oeis.a394;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A394917 Irregular triangle read by rows in which row n lists all k from [1..2^(n - 1)] with exactly n divisors.
 * @author Sean A. Irvine
 */
public class A394917 extends Sequence1 {

  private long mN = 1;
  private long mM = 0;

  @Override
  public Z next() {
    while (true) {
      if (++mM > 1L << (mN - 1)) {
        ++mN;
        mM = 1;
      }
      if (Functions.SIGMA0.l(mM) == mN) {
        return Z.valueOf(mM);
      }
    }
  }
}
