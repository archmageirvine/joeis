package irvine.oeis.a020;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A020079 <code>a(n) = floor( Gamma(n+1/7)/Gamma(1/7) )</code>.
 * @author Sean A. Irvine
 */
public class A020079 implements Sequence {

  private static final Q C = new Q(1, 7);
  private int mN = -2;
  private Q mA = Q.ONE;

  @Override
  public Z next() {
    if (++mN >= 0) {
      mA = mA.multiply(C.add(mN));
    }
    return mA.floor();
  }
}
