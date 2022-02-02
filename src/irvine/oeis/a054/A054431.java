package irvine.oeis.a054;

import irvine.math.z.Z;
import irvine.oeis.a003.A003989;

/**
 * A054431 Array read by antidiagonals: T(x, y) tells whether (x, y) are coprime (1) or not (0).
 * @author Sean A. Irvine
 */
public class A054431 extends A003989 {

  @Override
  public Z next() {
    //return Z.ONE.divide(super.next());
    return Z.ONE.equals(super.next()) ? Z.ONE : Z.ZERO;
  }
}
