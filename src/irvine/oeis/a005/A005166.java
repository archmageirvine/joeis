package irvine.oeis.a005;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A005166 <code>a(0) = 1; a(n) = (1 + a(0)^3 +</code> ... <code>+ a(n-1)^3)/n (not</code> always <code>integral!)</code>.
 * @author Sean A. Irvine
 */
public class A005166 implements Sequence {

  private long mN = -1;
  private Z mS = Z.ONE;
  private Z mA = Z.ONE;

  @Override
  public Z next() {
    if (++mN > 0) {
      mS = mS.add(mA.pow(3));
      final Q r = new Q(mS, Z.valueOf(mN));
      if (!r.isInteger()) {
        throw new UnsupportedOperationException("Not an integer");
      }
      mA = r.toZ();
    }
    return mA;
  }
}
