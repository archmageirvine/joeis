package irvine.oeis.a047;

import irvine.math.q.BernoulliSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A047682 a(n) = 4^(2*n)*(4^(2*n)-1)*Bernoulli(2*n)/(2*n).
 * @author Sean A. Irvine
 */
public class A047682 implements Sequence {

  private final BernoulliSequence mB = new BernoulliSequence(1);
  private int mN = 0;

  @Override
  public Z next() {
    mB.nextQ();
    final Z t = Z.ONE.shiftLeft(4 * ++mN);
    return mB.nextQ().divide(2L * mN).multiply(t.subtract(1)).multiply(t).toZ();
  }
}
