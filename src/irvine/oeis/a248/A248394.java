package irvine.oeis.a248;

import irvine.math.z.Z;
import irvine.oeis.a034.A034950;

/**
 * A248394 q-Expansion of the modular form of weight 3/2, g*theta(2) in Tunnell's notation (see Comments).
 * @author Georg Fischer
 */
public class A248394 extends A034950 {

  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    return ((mN & 1) == 0) ? Z.ZERO : super.next();
  }
}
