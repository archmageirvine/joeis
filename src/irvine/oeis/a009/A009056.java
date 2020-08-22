package irvine.oeis.a009;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A009056 Numbers &gt;= 3.
 * @author Sean A. Irvine
 */
public class A009056 implements Sequence {

  private Z mN = Z.TWO;

  @Override
  public Z next() {
    mN = mN.add(1);
    return mN;
  }
}
