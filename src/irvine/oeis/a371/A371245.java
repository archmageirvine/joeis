package irvine.oeis.a371;

import irvine.math.dirichlet.Dgf;
import irvine.math.dirichlet.Ds;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A371245 Number of factorizations of n into factors &gt; 4.
 * @author Georg Fischer
 * @author Sean A. Irvine
 */
public class A371245 extends Sequence1 {

  private int mN = 0;
  private Ds mDs = Dgf.one();

  @Override
  public Z next() {
    if (++mN >= 5) {
      mDs = Dgf.multiply(mDs, Dgf.zetap(mN));
    }
    return mDs.coeff(mN);
  }
}
