package irvine.oeis.a052;

import irvine.math.z.Z;
import irvine.oeis.a007.A007840;

/**
 * A052860 A simple grammar: rooted sequences of cycles.
 * @author Sean A. Irvine
 */
public class A052860 extends A007840 {

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

