package irvine.oeis.a069;

import irvine.math.q.BernoulliSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A069036.
 * @author Sean A. Irvine
 */
public class A069040 extends Sequence1 {

  private final BernoulliSequence mB = new BernoulliSequence(1);
  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      mB.nextQ();
      if (mB.nextQ().num().mod(++mN) == 0) {
        return Z.valueOf(mN);
      }
    }
  }
}

