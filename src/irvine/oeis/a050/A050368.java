package irvine.oeis.a050;

import irvine.math.dirichlet.Dgf;
import irvine.math.dirichlet.Ds;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A050368 Number of ways to factor n into distinct factors with 2 kinds of 2, 3 kinds of 3, ...
 * @author Sean A. Irvine
 */
public class A050368 extends Sequence1 {

  private int mN = 0;
  private Ds mDs = Dgf.one();

  @Override
  public Z next() {
    if (++mN >= 2) {
      mDs = Dgf.multiply(mDs, Dgf.pow(Dgf.simple(mN), mN));
    }
    return mDs.coeff(mN);
  }
}
