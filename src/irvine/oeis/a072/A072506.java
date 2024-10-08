package irvine.oeis.a072;

import irvine.math.function.Functions;
import irvine.math.z.Binomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A072506 Triangle giving T(n,m) = number of necklaces of two colors with 2n beads of which m=1..n are black.
 * @author Sean A. Irvine
 */
public class A072506 extends Sequence1 {

  private int mN = 0;
  private int mM = 0;

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 1;
    }
    final int g = Functions.GCD.i(2L * mN, mM);
    return Integers.SINGLETON.sumdiv(g, d -> Functions.PHI.z(d).multiply(Binomial.binomial(2L * mN / d, mM / d))).divide(2L * mN);
  }
}

