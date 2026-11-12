package irvine.oeis.a143;

import irvine.math.function.Functions;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A143334 Only odd and even version of Pascal's triangle sequence: t(n,m)=If[m*(n - m) == 0, 1, Mod[Binomial[n, m], 2]*Prime[n] + (1 - Mod[Binomial[n, m], 2])*(Prime[n] + 1)].
 * @author Sean A. Irvine
 */
public class A143334 extends Sequence0 {

  private long mN = 0;
  private long mM = -1;

  private Z t(final long n, final long m) {
    if (m == 0 || m == n) {
      return Z.ONE;
    }
    return Functions.PRIME.z(n).add(1 - Binomial.binomial(n, m, 2));
  }

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 0;
    }
    return t(mN, mM);
  }
}
