package irvine.oeis.a128;

import irvine.math.z.Z;
import irvine.oeis.a064.A064189;

/**
 * A128810 Triangle formed by reading triangle A064189 mod 2 . 
 * @author Georg Fischer
 */
public class A128810 extends A064189 {

  @Override
  public Z next() {
    return super.next().mod(Z.TWO);
  }
}
