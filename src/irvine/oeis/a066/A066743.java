package irvine.oeis.a066;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A066743 a(n) is the number of integers of the form (n^2+1)/(k^2+1), where k = 1,2,3,...,n.
 * @author Sean A. Irvine
 */
public class A066743 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    long cnt = 0;
    final long t = mN * mN + 1;
    for (long k = 1; k <= mN; ++k) {
      if (t % (k * k + 1) == 0) {
        ++cnt;
      }
    }
    return Z.valueOf(cnt);
  }
}

