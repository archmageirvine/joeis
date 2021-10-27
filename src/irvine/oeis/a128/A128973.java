package irvine.oeis.a128;

import irvine.math.z.Z;
import irvine.oeis.a038.A038622;

/**
 * A128973 Triangle formed by reading A038622 mod 2 . 
 * @author Georg Fischer
 */
public class A128973 extends A038622 {

  @Override
  public Z next() {
    return super.next().mod(Z.TWO);
  }
}
