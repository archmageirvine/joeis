package irvine.oeis.a121;

import irvine.math.z.Fibonacci;
import irvine.math.z.Z;
import irvine.oeis.a000.A000045;

/**
 * A127884 a(n) = floor(Fibonacci(n)/n).
 * @author Georg Fischer
 */
public class A127884 extends A000045 {

  private int mN = 0;

  {
    super.next();
  }

  @Override
  public int getOffset() {
    return 1;
  }

  @Override
  public Z next() {
    ++mN;
    return Fibonacci.fibonacci(mN).divide(mN);
  }
}
