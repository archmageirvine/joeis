package irvine.oeis.a001;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.math.q.BernoulliSequence;
import irvine.oeis.Sequence;

/**
 * A001469 Genocchi numbers (of first kind); unsigned coefficients give expansion of x*tan(x/2).
 * @author Sean A. Irvine
 */
public class A001469 implements Sequence {

  private final BernoulliSequence mSeq = new BernoulliSequence(1);
  private int mN = 0;

  @Override
  public Z next() {
    mSeq.next();
    return mSeq.next().multiply(2).multiply(new Q(Z.ONE.subtract(Z.ONE.shiftLeft(2 * ++mN)), Z.ONE)).toZ();
  }
}

