package irvine.oeis.a014;

import irvine.math.api.RationalSequence;
import irvine.math.q.BernoulliSequence;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A014509 Truncation of Bernoulli number: floor(|B_2n|) * sign(B_2n).
 * @author Sean A. Irvine
 */
public class A014509 implements Sequence {

  private final RationalSequence mBernoulli = new BernoulliSequence(0);

  @Override
  public Z next() {
    final Q res = mBernoulli.next();
    mBernoulli.next(); // skip odd
    return res.abs().floor().multiply(res.signum());
  }
}
