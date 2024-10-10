package irvine.oeis.a072;

import irvine.math.cr.CR;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A072549 a(n) = abs(floor(n + a(n-1)/n - n*log(n))).
 * @author Sean A. Irvine
 */
public class A072549 extends Sequence1 {

  private long mN = -1;
  private Z mA = Z.ONE;

  @Override
  public Z next() {
    if (++mN > 0) {
      mA = CR.valueOf(new Q(mA.square(), mN).add(mN)).subtract(CR.valueOf(mN).log().multiply(mN)).floor().abs();
    }
    return mA;
  }
}
