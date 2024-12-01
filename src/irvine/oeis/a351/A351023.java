package irvine.oeis.a351;

import irvine.math.dirichlet.Dgf;
import irvine.math.dirichlet.Ds;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A073500.
 * @author Sean A. Irvine
 */
public class A351023 extends Sequence1 {

  private int mN = 0;
  private Ds mDs = Dgf.one();

  @Override
  public Z next() {
    if (++mN >= 2) {
      mDs = Dgf.multiply(mDs, Dgf.simple(mN, Z.TWO));
    }
    return Dgf.inverse(mDs).coeff(mN);
  }
}
