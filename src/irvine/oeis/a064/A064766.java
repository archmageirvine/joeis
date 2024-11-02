package irvine.oeis.a064;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A064766 Fill up an infinite triangular array by rows by successively writing numbers 1, then 1 up to 2*3/2, then 1 up to 3*4/2, then 1 up to 4*5/2 and so on, at the k-th step writing the numbers from 1 up to the k-th triangular number. The final elements of the rows of this infinite triangle form the sequence.
 * @author Sean A. Irvine
 */
public class A064766 extends Sequence0 {

  private long mV = 0;
  private long mM = 1;
  private long mN = -1;

  @Override
  public Z next() {
    ++mN;
    for (long k = 0; k <= mN; ++k) {
      if (++mV > mM * (mM + 1) / 2) {
        ++mM;
        mV = 1;
      }
    }
    return Z.valueOf(mV);
  }
}

