package irvine.oeis.a391;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence3;

/**
 * A391754 a(n) = number of solutions involving 3 smaller numbers {i,j,k} that each exceed 0 such that i*n^2 + j*n + k, j*n^2 + k*n + i, and k*n^2 + i*n + j are distinct and have the same squarefree kernel.
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
