package irvine.oeis.a056;

import irvine.math.z.Binomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A056940 Number of antichains (or order ideals) in the poset 4*m*n or plane partitions with at most m rows and n columns and entries &lt;= 4.
 * @author Sean A. Irvine
 */
public class A056940 extends Sequence0 {

  private long mN = -1;
  private long mM = 0;
  private final int mT;

  protected A056940(final int t) {
    mT = t;
  }

  /** Construct the sequence. */
  public A056940() {
    this(3);
  }

  private Z t(final long n, final long m, final int t) {
    return Integers.SINGLETON.product(0, t, k -> Binomial.binomial(n + m + k, m + k))
      .divide(Integers.SINGLETON.product(0, t, k -> Binomial.binomial(n + k, k)));
  }

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 0;
    }
    return t(mN - mM, mM, mT);
  }
}
