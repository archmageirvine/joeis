package irvine.oeis.a065;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A065233 Fill a triangular array by rows by writing numbers 1 up to b(0), 1 up to b(1), etc., where the b(n) are the nonzero 9-gonal (nonagonal) numbers 1, 9, 24, 46, ... (A001106). The initial elements of the rows form a(n).
 * @author Sean A. Irvine
 */
public class A065233 extends Sequence0 {

  private long mV = 1;
  private long mM = 1;
  private long mN = -2;

  @Override
  public Z next() {
    ++mN;
    for (long k = 0; k <= mN; ++k) {
      if (++mV > mM * (7 * mM - 5) / 2) {
        ++mM;
        mV = 1;
      }
    }
    return Z.valueOf(mV);
  }
}

