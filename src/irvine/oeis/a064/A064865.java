package irvine.oeis.a064;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A064865 Fill a triangular array by rows by writing numbers 1, then 1 up to 2^2, then 1 up to 3^2, then 1 up to 4^2 and so on. The final elements of the rows form the sequence.
 * @author Sean A. Irvine
 */
public class A064865 extends Sequence1 {

  private long mV = 0;
  private long mM = 1;
  private long mN = -1;

  @Override
  public Z next() {
    ++mN;
    for (long k = 0; k <= mN; ++k) {
      if (++mV > mM * mM) {
        ++mM;
        mV = 1;
      }
    }
    return Z.valueOf(mV);
  }
}

