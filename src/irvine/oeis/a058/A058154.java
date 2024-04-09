package irvine.oeis.a058;

import irvine.math.monoid.CountMonoidProcessor;
import irvine.math.monoid.Monoids;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A058154 Number of labeled monoids of order n with a fixed identity.
 * @author Sean A. Irvine
 */
public class A058154 extends Sequence1 {

  protected int mN = 0;

  @Override
  public Z next() {
    final CountMonoidProcessor counter = new CountMonoidProcessor();
    new Monoids(++mN).generate(counter);
    return Z.valueOf(counter.getCount());
  }
}
