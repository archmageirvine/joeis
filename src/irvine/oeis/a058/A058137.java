package irvine.oeis.a058;

import irvine.math.monoid.CanonicalMonoidProcessor;
import irvine.math.monoid.CountIdempotentsMonoidProcessor;
import irvine.math.monoid.Monoids;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A058137 Triangle read by rows: monoids of order n with k idempotents.
 * @author Sean A. Irvine
 */
public class A058137 extends Sequence1 {

  private int mN = 0;
  private int mM = 0;
  private CountIdempotentsMonoidProcessor mCounter = null;

  @Override
  public Z next() {
    if (++mM > mN) {
      mCounter = new CountIdempotentsMonoidProcessor();
      new Monoids(++mN).generate(new CanonicalMonoidProcessor(mCounter));
      mM = 1;
    }
    return Z.valueOf(mCounter.getCount(mM));
  }
}
