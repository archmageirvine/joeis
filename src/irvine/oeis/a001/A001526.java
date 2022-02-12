package irvine.oeis.a001;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A001526 a(n) = (7n+1)*(7n+6).
 * @author Sean A. Irvine
 */
public class A001526 implements Sequence {

  private Z mN = Z.valueOf(-6);

  @Override
  public Z next() {
    mN = mN.add(7);
    return mN.multiply(mN.add(5));
  }
}
