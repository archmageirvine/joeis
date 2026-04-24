package irvine.oeis.a395;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A395185 allocated for S. S. Krishna Chaitanya Bulusu.
 * @author Sean A. Irvine
 */
public class A395185 extends Sequence1 {

  private long mN = 0;
  private long mM = -1;

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 0;
    }
    if (mN < 2) {
      return Z.ONE;
    }
    return Z.ONE.shiftLeft(Functions.BINOMIAL.l(mN - 2, mM - 1));
  }
}

