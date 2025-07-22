package irvine.oeis.a078;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A078841 Main diagonal of the table of k-almost primes (A078840): a(n) = (n+1)-st integer that is an n-almost prime.
 * @author Sean A. Irvine
 */
public class A078841 extends Sequence0 {

  private int mN = -1;

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ONE;
    }
    long t = 1;
    long k = 0;
    while (true) {
      final long omega = Functions.BIG_OMEGA.l(++t);
      if (omega == mN && ++k > mN) {
        return Z.valueOf(t);
      }
    }
  }
}
