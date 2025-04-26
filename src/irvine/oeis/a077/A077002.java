package irvine.oeis.a077;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A077002 a(1) = 1, a(n+1) is the largest triangular number &lt;= n*a(n).
 * @author Sean A. Irvine
 */
public class A077002 extends Sequence1 {

  private long mN = 0;
  private Z mA = null;

  @Override
  public Z next() {
    if (mA == null) {
      mA = Z.ONE;
    } else {
      mA = Functions.TRIANGULAR.z(Functions.TRINV.z(mA.multiply(++mN)));
    }
    return mA;
  }
}

