package irvine.oeis.a048;

import irvine.math.z.Z;
import irvine.oeis.a213.A213357;

/**
 * A048801 E.g.f. A(x) satisfies A(x) = 1 + x * A(exp(x) - 1).
 * @author Sean A. Irvine
 */
public class A048801 extends A213357 {

  private boolean mFirst = true;

  @Override
  public Z next() {
    if (mFirst) {
      mFirst = false;
      return Z.ONE;
    }
    return super.next().multiply(size());
  }
}
