package irvine.oeis.a028;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A028391 a(n) = n - floor(sqrt(n)).
 * @author Sean A. Irvine
 */
public class A028391 extends Sequence0 {

  private Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    mN = mN.add(1);
    return mN.subtract(mN.sqrt());
  }
}
