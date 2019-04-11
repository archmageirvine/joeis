package irvine.oeis.a013;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A013903 <code>a(n) = 22^(5*n + 2)</code>.
 * @author Sean A. Irvine
 */
public class A013903 implements Sequence {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.valueOf(484) : mA.multiply(5153632);
    return mA;
  }
}
