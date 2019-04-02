package irvine.oeis.a003;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A003056 n appears n+1 times. Also table T(n,k) = n+k read by antidiagonals.
 * @author Sean A. Irvine
 */
public class A003056 implements Sequence {

  private long mN = -1;
  private long mC = 0;

  @Override
  public Z next() {
    if (++mC > mN) {
      ++mN;
      mC = 0;
    }
    return Z.valueOf(mN);
  }
}
