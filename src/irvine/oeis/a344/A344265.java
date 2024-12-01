package irvine.oeis.a344;

import irvine.math.dirichlet.Dgf;
import irvine.math.dirichlet.Ds;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A344265 Dirichlet g.f.: Product_{k&gt;=2} (1 + k^(-s))^(2^(k-1)).
 * @author Sean A. Irvine
 */
public class A344265 extends Sequence1 {

  private int mN = 0;
  private Ds mDs = Dgf.one();

  @Override
  public Z next() {
    if (++mN >= 2) {
      mDs = Dgf.multiply(mDs, Dgf.pow(Dgf.simple(mN), Z.TWO.pow(mN - 1)));
    }
    return mDs.coeff(mN);
  }
}
