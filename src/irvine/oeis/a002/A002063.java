package irvine.oeis.a002;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A002063 <code>a(n) = 9*4^n</code>.
 * @author Sean A. Irvine
 */
public class A002063 implements Sequence {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.NINE : mA.shiftLeft(2);
    return mA;
  }
}

