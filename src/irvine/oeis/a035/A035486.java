package irvine.oeis.a035;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A035486 Kimberling's expulsion array read by antidiagonals.
 * @author Sean A. Irvine
 */
public class A035486 implements Sequence {

  protected long k(final long i, final long j) {
    long i1 = i;
    long j1 = j;
    while (j1 < 2 * i1 - 3) {
      if ((j1 & 1) == 0) {
        j1 = i1 - (j1 + 2) / 2;
      } else {
        j1 = i1 + (j1 - 1) / 2;
      }
      --i1;
    }
    return i1 + j1 - 1;
  }

  private int mN = 0;
  private int mM = 0;

  @Override
  public Z next() {
    if (++mM >= mN) {
      ++mN;
      mM = 0;
    }
    return Z.valueOf(k(mM + 1, mN - mM));
  }
}
