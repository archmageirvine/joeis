package irvine.oeis.a002;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A002089 a(n) = 11*4^n.
 * @author Sean A. Irvine
 */
public class A002089 implements Sequence {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.valueOf(11) : mA.shiftLeft(2);
    return mA;
  }
}
