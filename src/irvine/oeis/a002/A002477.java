package irvine.oeis.a002;

import irvine.math.z.Z;
import irvine.oeis.a000.A000042;

/**
 * A002477 Wonderful Demlo numbers: <code>a(n) = ((10^n - 1)/9)^2</code>.
 * @author Sean A. Irvine
 */
public class A002477 extends A000042 {
  @Override
  public Z next() {
    return super.next().square();
  }
}
