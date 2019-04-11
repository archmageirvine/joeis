package irvine.oeis.a013;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A013883 <code>a(n) = 17^(5*n + 2)</code>.
 * @author Sean A. Irvine
 */
public class A013883 implements Sequence {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.valueOf(289) : mA.multiply(1419857);
    return mA;
  }
}
