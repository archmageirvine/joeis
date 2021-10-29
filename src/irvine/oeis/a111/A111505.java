package irvine.oeis.a111;

import irvine.math.z.Z;
import irvine.oeis.triangle.Triangle;

/**
 * A111505 Right half of Pascal's triangle (A007318) with zeros.
 *
 * @author Georg Fischer
 */
public class A111505 extends Triangle {

  @Override
  public Z next() {
    Z result = super.next();
    if (mCol < (mRow + 1) / 2) {
      result = Z.ZERO;
    }
    return result;
  }

}
