package irvine.oeis.a050;

import irvine.math.dirichlet.Dgf;
import irvine.math.dirichlet.Ds;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a002.A002808;

/**
 * A050372 Number of ways to factor n into distinct composite factors.
 * @author Sean A. Irvine
 */
public class A050372 extends Sequence1 {

  private final Sequence mComposites = new A002808();
  private long mC = mComposites.next().longValueExact();
  private long mN = 0;
  private Ds mDs = Dgf.one();

  @Override
  public Z next() {
    if (++mN == mC) {
      mDs = Dgf.multiply(mDs, Dgf.simple(mN));
      mC = mComposites.next().longValueExact();
    }
    return mDs.coeff(mN);
  }
}
