package irvine.oeis.a339;

import irvine.math.dirichlet.Dgf;
import irvine.math.dirichlet.Ds;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A339322 Dirichlet g.f.: Product_{k&gt;=2} 1 / (1 - k^(-s))^7.
 * @author Georg Fischer
 * @author Sean A. Irvine
 */
public class A339322 extends Sequence1 {

  private int mN = 0;
  private Ds mDs = Dgf.one();

  @Override
  public Z next() {
    if (++mN >= 2) {
      mDs = Dgf.multiply(mDs, Dgf.pow(Dgf.zetap(mN), 7));
    }
    return mDs.coeff(mN);
  }
}
