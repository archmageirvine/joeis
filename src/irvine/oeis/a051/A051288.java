package irvine.oeis.a051;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A051288 Triangle read by rows: T(n,k) = number of paths of n upsteps U and n downsteps D that contain k UUDs.
 * @author Sean A. Irvine
 */
public class A051288 extends Sequence0 {

  private int mN = -1;
  private int mM = 0;

  @Override
  public Z next() {
    if (++mM > mN / 2) {
      ++mN;
      mM = 0;
    }
    return Binomial.binomial(mN, 2L * mM).multiply(Binomial.binomial(2L * mM, mM)).shiftLeft(mN - 2L * mM);
  }
}
