package irvine.oeis.a329;

import irvine.math.dirichlet.Dgf;
import irvine.math.dirichlet.Ds;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A329800 Dirichlet g.f.: Product_{k&gt;=2} 1 / (1 - k^(-s))^(2^(k - 1)).
 * @author Sean A. Irvine
 */
public class A329800 extends Sequence1 {

  private long mN = 0;
  private Ds mDs = Dgf.one();

  @Override
  public Z next() {
    if (++mN >= 2) {
      mDs = Dgf.multiply(mDs, Dgf.pow(Dgf.zetam(mN), Z.TWO.pow(mN - 1)));
    }
    return mDs.coeff(mN);
  }
}
