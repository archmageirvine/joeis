package irvine.oeis.a343;

import irvine.math.dirichlet.Dgf;
import irvine.math.dirichlet.Ds;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A343284 Dirichlet g.f.: Product_{k&gt;=2} 1 / (1 - k^(-s))^(k^4).
 * @author Georg Fischer
 * @author Sean A. Irvine
 */
public class A343284 extends Sequence1 {

  private int mN = 0;
  private Ds mDs = Dgf.one();

  @Override
  public Z next() {
    if (++mN >= 2) {
      mDs = Dgf.multiply(mDs, Dgf.pow(Dgf.zetap(mN), Z.valueOf(mN).pow(4)));
    }
    return mDs.coeff(mN);
  }
}
