package irvine.oeis.a020;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A020989 a(n) = (5*4^n - 2)/3.
 * @author Sean A. Irvine
 */
public class A020989 extends Sequence0 {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.ONE : mA.shiftLeft(2).add(2);
    return mA;
  }
}
