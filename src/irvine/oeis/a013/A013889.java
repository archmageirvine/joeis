package irvine.oeis.a013;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A013889 <code>a(n) = 18^(5*n + 4)</code>.
 * @author Sean A. Irvine
 */
public class A013889 implements Sequence {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.valueOf(104976) : mA.multiply(1889568);
    return mA;
  }
}
