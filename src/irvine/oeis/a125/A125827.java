package irvine.oeis.a125;

import irvine.math.z.Z;
import irvine.oeis.a128.A128171;

/**
 * A125827 Numbers n such that n divides <code>2^11 + 3^11 + 5^11 + ... + prime(n)^11</code>.
 * @author Sean A. Irvine
 */
public class A125827 extends A128171 {

  @Override
  protected Z start() {
    return Z.ZERO;
  }

  @Override
  protected int power() {
    return 11;
  }
}
