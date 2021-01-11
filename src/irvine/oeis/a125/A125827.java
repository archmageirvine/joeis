package irvine.oeis.a125;

import irvine.math.z.Z;
import irvine.oeis.a128.A128171;

/**
 * A125827 Numbers m such that m divides 2^11 + 3^11 + 5^11 + ... + prime(m)^11.
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
