package irvine.oeis.a141;

import irvine.math.z.Z;
import irvine.oeis.a005.A005439;

/**
 * A141449 A005439 mod 9.
 * @author Georg Fischer
 */
public class A141449 extends A005439 {

  @Override
  public Z next() {
    return super.next().mod(Z.NINE);
  }
}
