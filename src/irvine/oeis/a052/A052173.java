package irvine.oeis.a052;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A052173 Another version of the Catalan triangle A008315.
 * @author Sean A. Irvine
 */
public class A052173 implements Sequence {

  private long mN = -1;
  private long mM = 0;

  private Z t(final long n, final long m) {
    return Binomial.binomial(n, m).subtract(Binomial.binomial(n, m - 1));
  }

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 0;
    }
    return (mM & 1) == 1 ? Z.ZERO : t(mN, mM / 2);
  }
}
