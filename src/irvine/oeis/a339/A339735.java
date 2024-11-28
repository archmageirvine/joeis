package irvine.oeis.a339;

import irvine.math.dirichlet.Dgf;
import irvine.math.dirichlet.Ds;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A339735.
 * @author Sean A. Irvine
 */
public class A339735 extends Sequence1 {

  private long mN = 0;
  private Ds mDs = Dgf.one();

  @Override
  public Z next() {
    if (++mN >= 2) {
      mDs = Dgf.multiply(mDs, Dgf.pow(Dgf.zetap(mN), 9));
    }
    return mDs.coeff(mN);
  }
}
