package irvine.oeis.a027;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A027170 Triangular array T read by rows (4-diamondization of Pascal's triangle). Step 1: t(n,k) = C(n+2,k+1) + C(n+1,k) + C(n+1,k+1) + C(n,k). Step 2: T(n,k) = t(n,k) - t(0, 0) + 1. Domain: 0 &lt;= k &lt;= n, n &gt;= 0.
 * @author Sean A. Irvine
 */
public class A027170 extends AbstractSequence {

  /* Construct the sequence. */
  public A027170() {
    super(0);
  }

  private static final Z T0 = diamond(0, 0).subtract(1);

  private long mN = -1;
  private long mM = 0;

  private static Z diamond(final long n, final long k) {
    return Binomial.binomial(n + 2, k + 1)
      .add(Binomial.binomial(n + 1, k))
      .add(Binomial.binomial(n + 1, k + 1))
      .add(Binomial.binomial(n, k));
  }

  protected Z t(final long n, final long k) {
    return diamond(n, k).subtract(T0);
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
