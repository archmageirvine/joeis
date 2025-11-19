package irvine.oeis.a007;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.Sequence1;

/**
 * A007955 Product of divisors of n.
 * @author Sean A. Irvine
 */
public class A007955 extends Sequence1 implements DirectSequence {

  private long mN = 0;

  @Override
  public Z next() {
    return Jaguar.factor(++mN).pod();
  }

  @Override
  public Z a(final Z n) {
    return Jaguar.factor(n).pod();
  }

  @Override
  public Z a(final int n) {
    return Jaguar.factor(n).pod();
  }

}
