package irvine.oeis.a248;

import irvine.math.z.Z;
import irvine.oeis.a080.A080966;

/**
 * A248395 q-Expansion of the modular form of weight 3/2, g*theta(4) in Tunnell's notation (see Comments).
 * @author Georg Fischer
 */
public class A248395 extends A080966 {

  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    return ((mN & 0b11) != 0b01) ? Z.ZERO : super.next();
  }
}
