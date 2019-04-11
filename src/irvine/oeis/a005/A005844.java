package irvine.oeis.a005;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A005844 <code>a(n+1) = 2^a(n) - 1</code>.
 * @author Sean A. Irvine
 */
public class A005844 implements Sequence {

  private Z mN = Z.TWO;

  @Override
  public Z next() {
    mN = Z.ONE.shiftLeft(mN.intValueExact()).subtract(1);
    return mN;
  }
}
