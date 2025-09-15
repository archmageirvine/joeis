package irvine.oeis.a386;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A386431 Triangle T(n,k) read by rows, where row n contains the numbers 1, ..., n^2, written columnwise into a square matrix and read rowwise.
 * @author Sean A. Irvine
 */
public class A386431 extends Sequence1 {

  private long mN = 0;
  private long mM = 0;

  @Override
  public Z next() {
    if (++mM > mN * mN) {
      ++mN;
      mM = 1;
    }
    return Z.valueOf(1 + mN * mM - mN - (mN * mN - 1) * ((mM - 1) / mN));
  }
}
