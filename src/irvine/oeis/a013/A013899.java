package irvine.oeis.a013;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A013899 <code>a(n) = 21^(5*n + 2)</code>.
 * @author Sean A. Irvine
 */
public class A013899 implements Sequence {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.valueOf(441) : mA.multiply(4084101);
    return mA;
  }
}
