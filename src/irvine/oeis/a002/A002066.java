package irvine.oeis.a002;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A002066 <code>a(n) = 10*4^n</code>.
 * @author Sean A. Irvine
 */
public class A002066 implements Sequence {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.TEN : mA.shiftLeft(2);
    return mA;
  }
}

