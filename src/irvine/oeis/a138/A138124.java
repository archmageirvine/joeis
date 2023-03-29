package irvine.oeis.a138;

import irvine.math.z.Z;
import irvine.oeis.a061.A061652;

/**
 * A138124 Initial digit of n-th even superperfect number A061652(n).
 * @author Georg Fischer
 */
public class A138124 extends A061652 {

  @Override
  public Z next() {
    return new Z(super.next().toString().substring(0, 1));
  }
}
