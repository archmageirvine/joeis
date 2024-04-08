package irvine.oeis.a058;

import irvine.math.monoid.CanonicalMonoidProcessor;
import irvine.math.monoid.CountIdempotentsMonoidProcessor;
import irvine.math.monoid.Monoids;
import irvine.math.z.Z;
import irvine.oeis.Sequence3;

/**
 * A058129.
 * @author Sean A. Irvine
 */
public class A058139 extends Sequence3 {

  private int mN = 2;

  @Override
  public Z next() {
    final CountIdempotentsMonoidProcessor counter = new CountIdempotentsMonoidProcessor();
    new Monoids(++mN).generate(new CanonicalMonoidProcessor(counter));
    return Z.valueOf(counter.getCount(3));
  }
}
