package irvine.oeis.a001;

import irvine.math.z.Z;
import irvine.math.q.BernoulliSequence;
import irvine.oeis.Sequence;

/**
 * A001897 Denominators of cosecant numbers -2*(2^(2*n-1)-1)*Bernoulli(2*n).
 * @author Sean A. Irvine
 */
public class A001897 implements Sequence {

  private final BernoulliSequence mB = new BernoulliSequence(0);
  private int mN = -2;

  @Override
  public Z next() {
    mN += 2;
    if (mN == 0) {
      return Z.ONE;
    } else {
      return mB.get(mN).multiply(Z.ONE.shiftLeft(mN - 1).subtract(1).multiply(-2)).den();
    }
  }
}
