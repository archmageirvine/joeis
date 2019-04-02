package irvine.oeis.a013;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A013911 a(n) = 24^(5*n + 2).
 * @author Sean A. Irvine
 */
public class A013911 implements Sequence {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.valueOf(576) : mA.multiply(7962624);
    return mA;
  }
}
