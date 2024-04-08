package irvine.oeis.a058;

import irvine.math.monoid.CanonicalMonoidProcessor;
import irvine.math.monoid.CountMonoidProcessor;
import irvine.math.monoid.Monoids;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A058129.
 * @author Sean A. Irvine
 */
public class A058129 extends Sequence0 {

  private int mN = -1;

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ZERO;
    }
    final CountMonoidProcessor counter = new CountMonoidProcessor();
    new Monoids(mN).generate(new CanonicalMonoidProcessor(counter));
    return Z.valueOf(counter.getCount());
  }
}
