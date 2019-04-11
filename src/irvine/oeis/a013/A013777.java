package irvine.oeis.a013;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A013777 <code>a(n) = 2^(4*n + 3)</code>.
 * @author Sean A. Irvine
 */
public class A013777 implements Sequence {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.EIGHT : mA.shiftLeft(4);
    return mA;
  }
}
