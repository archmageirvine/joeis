package irvine.oeis.a020;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A020090 Integer part of <code>Gamma(n+1/2)/Gamma(1/2)</code>.
 * @author Sean A. Irvine
 */
public class A020090 implements Sequence {

  private int mN = -2;
  private Q mA = Q.ONE;

  @Override
  public Z next() {
    if (++mN >= 0) {
      mA = mA.multiply(Q.HALF.add(mN));
    }
    return mA.floor();
  }
}
