package irvine.oeis.a138;

import irvine.math.z.Z;
import irvine.oeis.a061.A061652;

/**
 * A138883 Number of digits in n-th even superperfect number A061652(n).
 * @author Georg Fischer
 */
public class A138883 extends A061652 {

  @Override
  public Z next() {
    return Z.valueOf(super.next().toString().length());
  }
}
