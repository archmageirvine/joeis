package irvine.oeis.a077;

import irvine.math.z.Z;
import irvine.oeis.a062.A062273;

/**
 * A077577 a(n) = floor(A062273(n)/n).
 * @author Sean A. Irvine
 */
public class A077577 extends A062273 {

  @Override
  public Z next() {
    return super.next().divide(mN);
  }
}

