package irvine.oeis.a002;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A002042.
 * @author Sean A. Irvine
 */
public class A002042 implements Sequence {

  private Z mA = Z.SEVEN;

  @Override
  public Z next() {
    final Z r = mA;
    mA = mA.shiftLeft(2);
    return r;
  }
}
