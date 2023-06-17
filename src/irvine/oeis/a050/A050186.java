package irvine.oeis.a050;

import irvine.factor.factor.Jaguar;
import irvine.math.LongUtils;
import irvine.math.Mobius;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A050186 Triangular array T read by rows: T(h,k) = number of binary words of k 1's and h-k 0's which are not a juxtaposition of 2 or more identical subwords.
 * @author Sean A. Irvine
 */
public class A050186 extends AbstractSequence {

  /** Construct the sequence. */
  public A050186() {
    super(0);
  }

  private long mN = -1;
  private long mM = 0;

  protected Z t(final long n, final long m) {
    if (m == 0) {
      return n <= 1 ? Z.ONE : Z.ZERO;
    }
    Z sum = Z.ZERO;
    for (final Z dd : Jaguar.factor(LongUtils.gcd(n, m)).divisors()) {
      final long d = dd.longValue();
      final int mobius = Mobius.mobius(d);
      if (mobius != 0) {
        sum = sum.signedAdd(mobius == 1, Binomial.binomial(n / d, m / d));
      }
    }
    return sum;
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
