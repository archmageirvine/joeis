package irvine.oeis.a197;

import irvine.math.z.Euler;
import irvine.math.z.Fibonacci;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A197219 a(n) = a(n) = Lucas(phi(n^2)).
 * @author Georg Fischer
 */
public class A197219 extends Sequence0 {

  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    if (mN == 0) {
      return Z.TWO;
    }
    return Fibonacci.lucas(Euler.phi(Z.valueOf(mN)).intValue());
  }
}
