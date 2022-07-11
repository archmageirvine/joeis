package irvine.oeis.a057;

import irvine.math.q.BernoulliSequence;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A057868 Denominator of "modified Bernoulli number" b(2n) = Bernoulli(2*n)/(2*n*n!).
 * @author Sean A. Irvine
 */
public class A057868 implements Sequence {

  private final BernoulliSequence mB = new BernoulliSequence(1);
  private long mN = 0;
  private Z mF = Z.ONE;

  @Override
  public Z next() {
    mN += 2;
    mF = mF.multiply(mN).multiply(mN - 1);
    mB.nextQ(); // skip odd terms
    final Q s = mB.nextQ().divide(mN).divide(mF).divide(2);
    return s.den();
  }
}

