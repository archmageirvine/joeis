package irvine.oeis.a394;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A394917 allocated for Juri-Stepan Gerasimov.
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
