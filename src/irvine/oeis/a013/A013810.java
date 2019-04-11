package irvine.oeis.a013;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A013810 <code>19^(4*n+1)</code>.
 * @author Sean A. Irvine
 */
public class A013810 implements Sequence {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.valueOf(19) : mA.multiply(130321);
    return mA;
  }
}
