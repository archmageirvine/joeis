package irvine.oeis.a005;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A005167 <code>a(n+1) = (1 + a(0)^4 + </code>... <code>+ a(n)^4 )/(n+1)</code> (not always integral!).
 * @author Sean A. Irvine
 */
public class A005167 implements Sequence {

  private long mN = -1;
  private Z mS = Z.ONE;
  private Z mA = Z.ONE;

  @Override
  public Z next() {
    if (++mN > 0) {
      mS = mS.add(mA.pow(4));
      final Q r = new Q(mS, Z.valueOf(mN));
      if (!r.isInteger()) {
        throw new UnsupportedOperationException("Not an integer");
      }
      mA = r.toZ();
    }
    return mA;
  }
}
