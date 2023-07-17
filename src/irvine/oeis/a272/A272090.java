package irvine.oeis.a272;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.a045.A045906;

/**
 * A272090 Number of chiral partitions of n; number of irreducible representations of the symmetric group S_n with nontrivial determinant.
 * @author Sean A. Irvine
 */
public class A272090 extends A045906 {

  /** Construct the sequence. */
  public A272090() {
    super(1);
  }

  // After Michel Marcus

  private long mN = 0;

  @Override
  public Z next() {
    if (++mN == 1) {
      return Z.ZERO;
    }
    final long e = mN & 1;
    final long m = mN / 2;
    int k1 = 1;
    long r = m;
    assert r != 0;
    while ((r & 1) == 0) {
      ++k1;
      r >>>= 1;
    }
    r >>>= 1;
    int s = 0;
    for (long j = k1 + 1; r != 0; r >>>= 1, ++j) {
      if ((r & 1) == 1) {
        s += j;
      }
    }
    Z sum = Z.ONE.shiftLeft(k1 - 1);
    if (e != 0) {
      sum = sum.add(Z.ONE.shiftLeft(Binomial.binomial(k1, 2).longValueExact()));
    }
    for (long v = 1; v < k1; ++v) {
      sum = sum.add(Z.ONE.shiftLeft((v + 1) * (k1 - 2) - Binomial.binomial(v, 2).longValueExact()));
    }
    return sum.shiftLeft(s);
  }
}
