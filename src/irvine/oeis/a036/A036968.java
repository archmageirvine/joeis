package irvine.oeis.a036;

import irvine.math.q.BernoulliSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A036968 Genocchi numbers (of first kind): expansion of 2*x/(exp(x)+1).
 * @author Sean A. Irvine
 */
public class A036968 extends Sequence1 {

  private final BernoulliSequence mB = new BernoulliSequence(1);
  private int mN = 0;

  @Override
  public Z next() {
    return mB.nextQ().multiply(Z.ONE.subtract(Z.ONE.shiftLeft(++mN))).multiply(2).toZ();
  }
}
