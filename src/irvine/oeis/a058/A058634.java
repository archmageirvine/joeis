package irvine.oeis.a058;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A058634 a(n) = floor(b(n)), where b(n) = 1/cos(b(n-1)), b(0) = 1.
 * @author Sean A. Irvine
 */
public class A058634 extends Sequence0 {

  private CR mA = null;

  @Override
  public Z next() {
    mA = mA == null ? CR.ONE : mA.cos().inverse();
    return mA.floor();
  }
}
