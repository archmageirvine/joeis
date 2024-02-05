package irvine.oeis.a069;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A069466 Triangle T(n, k) of numbers of square lattice walks that start and end at origin after 2*n steps and contain exactly k steps to the east, possibly touching origin at intermediate stages.
 * @author Sean A. Irvine
 */
public class A069466 extends Sequence0 {

  private long mN = -1;
  private long mM = 0;

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 0;
    }
    return Binomial.binomial(2 * mN, mN).multiply(Binomial.binomial(mN, mM).square());
  }
}
