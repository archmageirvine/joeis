package irvine.oeis.a005;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A005566 Number of walks of length n on square lattice, starting at origin, staying in first quadrant.
 * @author Sean A. Irvine
 */
public class A005566 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    ++mN;
    return Binomial.binomial(mN, mN / 2).multiply(Binomial.binomial(mN + 1, (mN + 1) / 2));
  }
}

