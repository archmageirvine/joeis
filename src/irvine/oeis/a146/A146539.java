package irvine.oeis.a146;
// manually 2021-07-05

import irvine.math.z.Z;
import irvine.oeis.a061.A061045;

/**
 * A146539 A061045 mod 9.
 * @author Georg Fischer
 */
public class A146539 extends A061045 {

  /** Construct the sequence. */
  public A146539() {
    for (int i = 1; i <= 5; ++i) {
      super.next();
    }
  }

  @Override
  public Z next() {
    return super.next().mod(Z.NINE);
  }

}
