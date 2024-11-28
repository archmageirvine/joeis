package irvine.oeis.a371;

import irvine.math.dirichlet.Dgf;
import irvine.math.dirichlet.Ds;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A371244 Number of factorizations of n into factors &gt; 3.
 * @author Georg Fischer
 * @author Sean A. Irvine
 */
public class A371244 extends Sequence1 {

  private int mN = 0;
  private Ds mDs = Dgf.one();

  @Override
  public Z next() {
    if (++mN >= 4) {
      mDs = Dgf.multiply(mDs, Dgf.zetam(mN));
    }
    return mDs.coeff(mN);
  }
}
