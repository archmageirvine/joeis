package irvine.oeis.a002;

import irvine.math.z.Z;
import irvine.oeis.a000.A000203;

/**
 * A002659 a(n) = 2*sigma(n) - 1.
 * @author Sean A. Irvine
 */
public class A002659 extends A000203 {

  @Override
  public Z next() {
    return super.next().multiply2().subtract(1);
  }
}
