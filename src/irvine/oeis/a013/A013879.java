package irvine.oeis.a013;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A013879 <code>a(n) = 16^(5*n + 2)</code>.
 * @author Sean A. Irvine
 */
public class A013879 implements Sequence {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.valueOf(256) : mA.shiftLeft(20);
    return mA;
  }
}
