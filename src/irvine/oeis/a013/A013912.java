package irvine.oeis.a013;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A013912 a(n) = 24^(5*n + 3).
 * @author Sean A. Irvine
 */
public class A013912 extends Sequence0 {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.valueOf(13824) : mA.multiply(7962624);
    return mA;
  }
}
