package irvine.oeis.a058;

import irvine.math.monoid.CommutativeMonoids;
import irvine.math.monoid.CountMonoidProcessor;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A058129.
 * @author Sean A. Irvine
 */
public class A058156 extends Sequence1 {

  protected int mN = 0;

  @Override
  public Z next() {
    final CountMonoidProcessor counter = new CountMonoidProcessor();
    new CommutativeMonoids(++mN).generate(counter);
    return Z.valueOf(counter.getCount());
  }
}
