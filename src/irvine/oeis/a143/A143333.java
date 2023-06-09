package irvine.oeis.a143;

import irvine.math.z.Z;
import irvine.oeis.a007.A007318;

/**
 * A143333 Pascal&apos;s triangle binomial(n,m) read by rows, all even elements replaced by zero.
 * @author Georg Fischer
 */
public class A143333 extends A007318 {

  @Override
  public Z next() {
    final Z result = super.next();
    return result.testBit(0) ? result : Z.ZERO;
  }
}
