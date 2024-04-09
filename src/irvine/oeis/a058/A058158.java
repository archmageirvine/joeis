package irvine.oeis.a058;

import irvine.math.monoid.CountIdempotentsMonoidProcessor;
import irvine.math.monoid.Monoids;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A058158 Triangle read by rows: T(n,k) is the number of labeled monoids of order n with k idempotents and a fixed identity.
 * @author Sean A. Irvine
 */
public class A058158 extends Sequence1 {

  protected int mN = 0;
  private int mM = 0;
  private CountIdempotentsMonoidProcessor mCounter = null;

  @Override
  public Z next() {
    if (++mM > mN) {
      mCounter = new CountIdempotentsMonoidProcessor();
      new Monoids(++mN).generate(mCounter);
      mM = 1;
    }
    return Z.valueOf(mCounter.getCount(mM));
  }
}
