package irvine.oeis.a020;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A020989.
 * @author Sean A. Irvine
 */
public class A020989 implements Sequence {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.ONE : mA.shiftLeft(2).add(2);
    return mA;
  }
}
