package irvine.oeis.a197;

import irvine.math.z.Euler;
import irvine.math.z.Fibonacci;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A197190 a(0) = 2, a(n) = Lucas(phi(n^2)) for n &gt; 0.
 * @author Georg Fischer
 */
public class A197190 extends Sequence0 {

  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    if (mN == 0) {
      return Z.TWO;
    }
    return Fibonacci.lucas(Euler.phi(Z.valueOf(mN * mN)).intValue());
  }
}
