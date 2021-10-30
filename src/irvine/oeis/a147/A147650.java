package irvine.oeis.a147;
// manually at 2021-07-05

import irvine.math.z.Z;
import irvine.oeis.a061.A061040;

/**
 * A147650 First trisection of A061040.
 * @author Georg Fischer
 */
public class A147650 extends A061040 {

  @Override
  public Z next() {
    final Z result = super.next();
    super.next();
    super.next();
    return result;
  }
}
