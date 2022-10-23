package irvine.oeis.a047;

import irvine.math.q.BernoulliSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A047680 Order of cyclic group of diffeomorphism classes of exotic (4n-1)-spheres which bound parallelizable manifolds, for n &gt;= 2.
 * @author Sean A. Irvine
 */
public class A047680 extends Sequence1 {

  private final BernoulliSequence mB = new BernoulliSequence(1);
  private int mN = 0;

  @Override
  public Z next() {
    mB.nextQ();
    mB.nextQ();
    mB.nextQ();
    return mB.nextQ().divide(++mN).num().multiply(Z.ONE.shiftLeft(2 * mN - 1).subtract(1)).shiftLeft(2 * mN - 2).negate();
  }
}
