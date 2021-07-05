package irvine.oeis.a146;
// manually at 2021-07-05

import irvine.math.z.Z;
import irvine.oeis.a061.A061043;

/**
 * A146975 First quintisection of A061043: A061043(5n).
 * @author Georg Fischer
 */
public class A146975 extends A061043 {

  @Override
  public Z next() {
    final Z result = super.next();
    super.next();
    super.next();
    super.next();
    super.next();
    return result;
  }
}
