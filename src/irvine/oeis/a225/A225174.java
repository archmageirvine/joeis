package irvine.oeis.a225;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.oeis.a165.A165430;

/**
 * A225174 Square array read by antidiagonals: T(m,n) = greatest common unitary divisor of m and n.
 * @author Sean A. Irvine
 */
public class A225174 extends Sequence1 {

  private long mN = 0;
  private long mM = 0;

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 1;
    }
    return Z.valueOf(A165430.gcud(mN - mM + 1, mM));
  }
}
