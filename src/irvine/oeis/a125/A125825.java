package irvine.oeis.a125;

import irvine.math.z.Z;
import irvine.oeis.a128.A128171;

/**
 * A125825 Numbers n such that n divides <code>2^6 + 3^6 + 5^6 + </code>... + prime(n)^6.
 * @author Sean A. Irvine
 */
public class A125825 extends A128171 {

  @Override
  protected Z start() {
    return Z.ZERO;
  }

  @Override
  protected int power() {
    return 6;
  }
}
