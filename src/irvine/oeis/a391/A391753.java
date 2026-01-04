package irvine.oeis.a391;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence3;

/**
 * A391753 allocated for Michael De Vlieger.
 * @author Sean A. Irvine
 */
public class A391753 extends Sequence3 {

  // todo mismatches data

  private long mN = 2;

  @Override
  public Z next() {
    ++mN;
    long cnt = 0;
    for (long k = 2; k < mN; ++k) {
      for (long j = 1; j < k; ++j) {
        final long r = k * mN + j;
        final long s = j * mN + k;
        if (r != s && Functions.RAD.l(r) == Functions.RAD.l(s)) {
          ++cnt;
        }
      }
    }
    return Z.valueOf(cnt);
  }
}
