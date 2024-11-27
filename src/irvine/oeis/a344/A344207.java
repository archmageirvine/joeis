package irvine.oeis.a344;

import irvine.math.dirichlet.Dgf;
import irvine.math.dirichlet.Ds;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A344207 Dirichlet g.f.: Product_{k&gt;=2} 1 / (1 - k^(-s))^binomial(k+6,7).
 * @author Georg Fischer
 * @author Sean A. Irvine
 */
public class A344207 extends Sequence1 {

  private int mN = 0;
  private Ds mDs = Dgf.one();

  @Override
  public Z next() {
    if (++mN >= 2) {
      mDs = Dgf.multiply(mDs, Dgf.pow(Dgf.zetap(mN), Binomial.binomial(mN + 6, 7)));
    }
    return mDs.coeff(mN);
  }
}
