package irvine.oeis.a066;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A066451 a(n) is the number of integers k &gt; 0 such that (n*k+1)/(k^2+1) is an integer.
 * @author Sean A. Irvine
 */
public class A066451 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    long cnt = 1;
    for (long k = 1; k < mN; ++k) {
      if ((mN * k + 1) % (k * k + 1) == 0) {
        ++cnt;
      }
    }
    return Z.valueOf(cnt);
  }
}

