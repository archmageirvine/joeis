package irvine.oeis.a138;

import irvine.math.z.Z;
import irvine.oeis.a061.A061652;

/**
 * A138125 Final digit of n-th even superperfect number A061652(n).
 * @author Georg Fischer
 */
public class A138125 extends A061652 {

  @Override
  public Z next() {
    return super.next().mod(Z.TEN);
  }
}
