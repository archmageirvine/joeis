package irvine.oeis.a219;

import irvine.math.z.Fibonacci;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A219010 a(n) = Lucas(2*5^n).
 * @author Georg Fischer
 */
public class A219010 extends Sequence0 {

  private int mA5 = 2;

  @Override
  public Z next() {
    final Z result = Fibonacci.lucas(mA5);
    mA5 *= 5;
    return result;
  }
}
