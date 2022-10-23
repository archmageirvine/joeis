package irvine.oeis.a000;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A000038 Twice A000007.
 * @author Sean A. Irvine
 */
public class A000038 extends Sequence0 {

  private boolean mFirst = true;

  @Override
  public Z next() {
    if (mFirst) {
      mFirst = false;
      return Z.TWO;
    }
    return Z.ZERO;
  }
}

