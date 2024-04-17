package irvine.oeis.a059;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A059339 A+B=C for 0&lt;=A, 0&lt;=B, A&lt;=B; if n is a C-almost prime then a(n) = number of decompositions of n into sum of an A-almost prime and a B-almost prime.
 * @author Sean A. Irvine
 */
public class A059339 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    final long omega = Functions.BIG_OMEGA.l(++mN);
    long cnt = 0;
    for (long m = 1; 2 * m <= mN; ++m) {
      if (Functions.BIG_OMEGA.l(m) + Functions.BIG_OMEGA.l(mN - m) == omega) {
        ++cnt;
      }
    }
    return Z.valueOf(cnt);
  }
}
