package irvine.oeis.a069;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A069269 Second level generalization of Catalan triangle (0th level is Pascal's triangle A007318; first level is Catalan triangle A009766; 3rd level is A069270).
 * @author Sean A. Irvine
 */
public class A069269 extends Sequence0 {

  private long mN = -1;
  private long mM = 0;

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 0;
    }
    return Binomial.binomial(mN + 2 * mM, mM).multiply(mN - mM + 1).divide(mN + mM + 1);
  }
}
