package irvine.oeis.a356;

import irvine.math.z.Z;
import irvine.oeis.a061.A061418;

/**
 * A356556 Parity of A061418.
 * @author Georg Fischer
 */
public class A356556 extends A061418 {

  @Override
  public Z next() {
    return super.next().testBit(0) ? Z.ONE : Z.ZERO;
  }
}
