package irvine.oeis.a058;

import irvine.math.monoid.CanonicalMonoidProcessor;
import irvine.math.monoid.CommutativeMonoids;
import irvine.math.monoid.CountIdempotentsMonoidProcessor;
import irvine.math.z.Z;
import irvine.oeis.Sequence2;

/**
 * A058129.
 * @author Sean A. Irvine
 */
public class A058143 extends Sequence2 {

  private int mN = 1;

  @Override
  public Z next() {
    final CountIdempotentsMonoidProcessor counter = new CountIdempotentsMonoidProcessor();
    new CommutativeMonoids(++mN).generate(new CanonicalMonoidProcessor(counter));
    return Z.valueOf(counter.getCount(2));
  }
}
