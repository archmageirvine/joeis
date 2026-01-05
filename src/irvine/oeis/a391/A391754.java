package irvine.oeis.a391;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence3;

/**
 * A391754 allocated for Michael De Vlieger.
 * @author Sean A. Irvine
 */
public class A391754 extends Sequence3 {

  private long mN = 2;

  @Override
  public Z next() {
    ++mN;
    long cnt = 0;
    for (long k = 2; k < mN; ++k) {
      for (long j = 1; j < k; ++j) {
        for (long i = 1; i < k; ++i) {
          if (i != j) {
            final long r = (k * mN + j) * mN + i;
            final long s = (j * mN + i) * mN + k;
            final long t = (i * mN + k) * mN + j;
            if (r != s && r != t && s != t) {
              final long rr = Functions.RAD.l(r);
              if (rr == Functions.RAD.l(s) && rr == Functions.RAD.l(t)) {
                ++cnt;
              }
            }
          }
        }
      }
    }
    return Z.valueOf(cnt);
  }
}
