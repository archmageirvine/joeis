package irvine.oeis.a014;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A014550 Binary reflected Gray code.
 * @author Sean A. Irvine
 */
public class A014550 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    ++mN;
    return new Z(Long.toBinaryString(mN ^ (mN >>> 1)));
  }
}
