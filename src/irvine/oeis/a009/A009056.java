package irvine.oeis.a009;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A009056 Numbers &gt;= 3.
 * @author Sean A. Irvine
 */
public class A009056 extends Sequence1 {

  private Z mN = Z.TWO;

  @Override
  public Z next() {
    mN = mN.add(1);
    return mN;
  }
}
