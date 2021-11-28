package irvine.oeis.a052;

import irvine.math.z.Z;
import irvine.oeis.a000.A000248;

/**
 * A052512 Number of rooted labeled trees of height at most 2.
 * @author Sean A. Irvine
 */
public class A052512 extends A000248 {

  private boolean mFirst = true;

  @Override
  public Z next() {
    if (mFirst) {
      mFirst = false;
      return Z.ZERO;
    }
    return super.next().multiply(mN + 1);
  }
}

