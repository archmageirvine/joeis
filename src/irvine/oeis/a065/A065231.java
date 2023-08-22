package irvine.oeis.a065;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A065231 Fill a triangular array by rows by writing numbers 1 up to b(0), 1 up to b(1), etc., where b(n) are the heptagonal numbers (A000566). The first elements of the rows form a(n).
 * @author Sean A. Irvine
 */
public class A065231 extends Sequence0 {

  private long mV = 1;
  private long mM = 1;
  private long mN = -2;

  @Override
  public Z next() {
    ++mN;
    for (long k = 0; k <= mN; ++k) {
      if (++mV > mM * (5 * mM - 3) / 2) {
        ++mM;
        mV = 1;
      }
    }
    return Z.valueOf(mV);
  }
}

