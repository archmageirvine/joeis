package irvine.oeis.a050;

import irvine.math.dirichlet.Dgf;
import irvine.math.dirichlet.Ds;
import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A050326 Number of factorizations of n into distinct squarefree numbers &gt; 1.
 * @author Sean A. Irvine
 */
public class A050326 extends Sequence1 {

  private long mN = 0;
  private Ds mDs = Dgf.one();

  @Override
  public Z next() {
    ++mN;
    if (mN > 1 && Predicates.SQUARE_FREE.is(mN)) {
      mDs = Dgf.multiply(mDs, Dgf.simple(mN));
    }
    return mDs.coeff(mN);
  }
}
