package irvine.oeis.a242;

import irvine.math.z.Z;
import irvine.oeis.a004.A004152;

/**
 * A242538 Squares that are sum of digits of factorials.
 * @author Georg Fischer
 */
public class A242538 extends A004152 {

  private Z mS = Z.ZERO;

  @Override
  public Z next() {
    Z result = super.next();
    while (!result.isSquare() || result.equals(mS)) {
      result = super.next();
    }
    mS = result;
    return result;
  }
}
