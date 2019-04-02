package irvine.oeis.a001;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A001220 Wieferich primes: primes p such that p^2 divides 2^(p-1) - 1.
 * @author Sean A. Irvine
 */
public class A001220 implements Sequence {

  private int mN = 0;

  @Override
  public Z next() {
    if (mN == 0) {
      ++mN;
      return Z.valueOf(1093);
    }
    if (mN == 1) {
      ++mN;
      return Z.valueOf(3511);
    }
    throw new UnsupportedOperationException("Next term, if if exists, exceeds 6.7*10^15");
  }
}
