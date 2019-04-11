package irvine.oeis.a013;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A013875 <code>a(n) = 15^(5*n + 2)</code>.
 * @author Sean A. Irvine
 */
public class A013875 implements Sequence {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.valueOf(225) : mA.multiply(759375);
    return mA;
  }
}
