package irvine.oeis.a020;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A020134.
 * @author Sean A. Irvine
 */
public class A020134 implements Sequence {

  private int mN = -2;
  private Q mA = Q.ONE;

  @Override
  public Z next() {
    if (++mN >= 0) {
      mA = mA.multiply(Q.ONE_THIRD.add(mN));
    }
    return mA.ceiling();
  }
}
