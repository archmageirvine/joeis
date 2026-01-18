package irvine.oeis.a083;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A083246 Numbers n such that at least one of the following four conditions is satisfied: 1# d(n)=phi(n); 2# d(n)=u(n); 3# phi(n)=u(n), or 4# n=2u(n). Here d(n)=A000005(n) is the number of divisors of n, phi(n)=A000010(n) is Euler's totient and u(n)=A045763(n) is the size of the 'unrelated set'.
 * @author Sean A. Irvine
 */
public class A083246 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      final long r = Functions.PHI.l(++mN);
      final long d = Functions.SIGMA0.l(mN);
      final long u = mN - r - d + 1;
      if (d == r || d == u || r == u || 2 * u == mN) {
        return Z.valueOf(mN);
      }
    }
  }
}

