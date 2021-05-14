package irvine.oeis.a047;

import irvine.math.q.BernoulliSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A047681 a(n) = 3^(2*n)*(3^(2*n)-1)*Bernoulli(2*n)/(2*n).
 * @author Sean A. Irvine
 */
public class A047681 implements Sequence {

  private final BernoulliSequence mB = new BernoulliSequence(1);
  private int mN = 0;
  private Z mT = Z.ONE;

  @Override
  public Z next() {
    mB.nextQ();
    mT = mT.multiply(9);
    return mB.nextQ().divide(2L * ++mN).multiply(mT.subtract(1)).multiply(mT).toZ();
  }
}
