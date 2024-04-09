package irvine.oeis.a058;

import irvine.math.monoid.CanonicalMonoidProcessor;
import irvine.math.monoid.CountIdempotentsMonoidProcessor;
import irvine.math.monoid.Monoids;
import irvine.math.z.Z;
import irvine.oeis.Sequence2;

/**
 * A058138 Monoids of order n with 2 idempotents.
 * @author Sean A. Irvine
 */
public class A058138 extends Sequence2 {

  private int mN = 1;

  @Override
  public Z next() {
    final CountIdempotentsMonoidProcessor counter = new CountIdempotentsMonoidProcessor();
    new Monoids(++mN).generate(new CanonicalMonoidProcessor(counter));
    return Z.valueOf(counter.getCount(2));
  }
}
