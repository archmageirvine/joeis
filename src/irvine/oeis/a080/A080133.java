package irvine.oeis.a080;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A080133 Conjectured number of generalized Fermat primes of the form (n+1)^2^k + n^2^k, with k&gt;0.
 * @author Sean A. Irvine
 */
public class A080133 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    final Z n = Z.valueOf(++mN);
    final Z n1 = Z.valueOf(mN + 1);
    long cnt = 0;
    final int lim = mN <= 16 ? 5 : 16; // 5 is sufficient for currently conjectured terms
    for (int k = 1; k <= lim; ++k) {
      final long j = 1L << k;
      if (n1.pow(j).add(n.pow(j)).isProbablePrime()) {
        ++cnt;
      }
    }
    return Z.valueOf(cnt);
  }
}

