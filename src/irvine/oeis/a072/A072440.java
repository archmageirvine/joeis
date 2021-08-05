package irvine.oeis.a072;
// manually 2021-08-04

import irvine.math.z.Z;
import irvine.oeis.a003.A003586;

/**
 * A072440 3-smooth numbers k with decimal digits <= 3.
 * @author Georg Fischer
 */
public class A072440 extends A003586 {

  @Override
  public Z next() {
    Z result = super.next();
    while (! result.toString().matches("[0-3]+")) {
      result = super.next();
    }
    return result;
  }
}
