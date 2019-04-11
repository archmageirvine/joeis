package irvine.oeis.a125;

import irvine.math.z.Z;
import irvine.oeis.a128.A128171;

/**
 * A125828 Numbers n such that n divides <code>2^8 + 3^8 + ... +</code> prime(n)^8.
 * @author Sean A. Irvine
 */
public class A125828 extends A128171 {

  @Override
  protected Z start() {
    return Z.ZERO;
  }

  @Override
  protected int power() {
    return 8;
  }
}
