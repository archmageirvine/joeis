package irvine.oeis.a026;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A026907 Triangular array T read by rows <code>(9-diamondization</code> of Pascal's triangle). Step <code>1: t(n,k) =</code> sum of 9 entries in diamond-shaped subarray of Pascal's triangle having vertices <code>C(n,k), C(n+4,k+2), C(n+2,k), C(n+2,k+2)</code>. Step <code>2: T(n,k) = t(n,k) - t(0,0) + 1</code>.
 * @author Sean A. Irvine
 */
public class A026907 implements Sequence {

  // After Michel Marcus

  private static final Z T0 = diamond(0, 0).subtract(1);

  private long mN = -1;
  private long mM = 0;

  private static Z diamond(final long n, final long k) {
    return Binomial.binomial(n + 4, k + 2)
      .add(Binomial.binomial(n + 3, k + 1))
      .add(Binomial.binomial(n + 3, k + 2))
      .add(Binomial.binomial(n + 2, k))
      .add(Binomial.binomial(n + 2, k + 1))
      .add(Binomial.binomial(n + 2, k + 2))
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
