package irvine.oeis.a146;
// manually 2021-07-05

import irvine.math.z.Z;
import irvine.oeis.a061.A061039;

/**
 * A146322 A061039(n) mod 9.
 * @author Georg Fischer
 */
public class A146322 extends A061039 {

  @Override
  public Z next() {
    return super.next().mod(Z.NINE);
  }

}
