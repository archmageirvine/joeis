package irvine.oeis.a125;

import irvine.math.z.Z;
import irvine.oeis.a128.A128171;

/**
 * A125826 Numbers n such that n divides <code>2^7 + 3^7 + 5^7 + </code>... + prime(n)^7.
 * @author Sean A. Irvine
 */
public class A125826 extends A128171 {

  @Override
  protected Z start() {
    return Z.ZERO;
  }
}
