package irvine.oeis.a013;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A013885 <code>a(n) = 17^(5*n + 4)</code>.
 * @author Sean A. Irvine
 */
public class A013885 implements Sequence {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.valueOf(83521) : mA.multiply(1419857);
    return mA;
  }
}
