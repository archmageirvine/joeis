package irvine.oeis.a007;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A007012 a(n) is number of k for which C(n,k) is not divisible by n.
 * @author Sean A. Irvine
 */
public class A007012 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ONE;
    }
    long c = 0;
    // This is not that efficient, could halve the work due to symmetry,
    // and potential use direct mod n binomial calculation
    for (long k = 0; k <= mN; ++k) {
      if (Binomial.binomial(mN, k).mod(mN) != 0) {
        ++c;
      }
    }
    return Z.valueOf(c);
  }
}

