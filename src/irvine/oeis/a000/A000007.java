package irvine.oeis.a000;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A000007 The characteristic function of <code>{0}: a(n) = 0^n</code>.
 * @author Sean A. Irvine
 */
public class A000007 implements Sequence {

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

