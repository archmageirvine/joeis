package irvine.oeis.a028;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A028391 <code>a(n) = n - floor(sqrt(n))</code>.
 * @author Sean A. Irvine
 */
public class A028391 implements Sequence {

  private Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    mN = mN.add(1);
    return mN.subtract(mN.sqrt());
  }
}
