package irvine.oeis.a013;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A013874 <code>a(n) = 15^(5*n + 1)</code>.
 * @author Sean A. Irvine
 */
public class A013874 implements Sequence {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.valueOf(15) : mA.multiply(759375);
    return mA;
  }
}
