package irvine.oeis.a045;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A045634 Number of ways in which n can be partitioned as a sum of a square and cube.
 * @author Sean A. Irvine
 */
public class A045634 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    ++mN;
    long cnt = 0;
    long s;
    for (long k = 0; (s = mN - k * k * k) >= 0; ++k) {
      final long t = Functions.SQRT.l(s);
      if (t * t == s) {
        ++cnt;
      }
    }
    return Z.valueOf(cnt);
  }
}
