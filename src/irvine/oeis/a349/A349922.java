package irvine.oeis.a349;

import irvine.math.dirichlet.Dgf;
import irvine.math.dirichlet.Ds;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A073500.
 * @author Sean A. Irvine
 */
public class A349922 extends Sequence1 {

  private static final Z NEG3 = Z.valueOf(-3);
  private int mN = 0;
  private Ds mDs = Dgf.one();

  @Override
  public Z next() {
    if (++mN >= 2) {
      mDs = Dgf.multiply(mDs, Dgf.simple(mN, NEG3));
    }
    return Dgf.inverse(mDs).coeff(mN);
  }
}
