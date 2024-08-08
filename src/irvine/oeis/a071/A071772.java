package irvine.oeis.a071;

import irvine.math.q.BernoulliSequence;
import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A071771.
 * @author Sean A. Irvine
 */
public class A071772 extends A000040 {

  private final BernoulliSequence mB = new BernoulliSequence(0);

  @Override
  public Z next() {
    return mB.get(super.next().intValueExact() - 1).num().abs();
  }
}
