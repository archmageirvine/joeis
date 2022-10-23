package irvine.oeis.a000;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A000007 The characteristic function of {0}: a(n) = 0^n.
 * @author Sean A. Irvine
 */
public class A000007 extends Sequence0 {

  private boolean mFirst = true;

  @Override
  public Z next() {
    if (mFirst) {
      mFirst = false;
      return Z.ONE;
    }
    return Z.ZERO;
  }
}

