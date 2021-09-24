package irvine.oeis.a051;

import irvine.factor.factor.Cheetah;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A051681 Smallest term of first run of exactly n consecutive integers which are not squarefree.
 * @author Sean A. Irvine
 */
public class A051681 implements Sequence {

  private long mN = 0;
  private long mM = 3;

  private boolean is(final long m, final long n) {
    if (Cheetah.factor(m - 1).isSquareFree() && Cheetah.factor(m + n).isSquareFree()) {
      for (int k = 0; k < n; ++k) {
        if (Cheetah.factor(m + k).isSquareFree()) {
          return false;
        }
      }
      return true;
    }
    return false;
  }

  @Override
  public Z next() {
    ++mN;
    while (true) {
      if (is(++mM, mN)) {
        return Z.valueOf(mM);
      }
    }
  }
}
