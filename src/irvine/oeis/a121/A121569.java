package irvine.oeis.a121;

import irvine.math.z.Fibonacci;
import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A121569 a(n) = Fibonacci((prime(n)+3)/2) - 1.
 * @author Georg Fischer
 */
public class A121569 extends A000040 {

  {
    super.next();
  }

  @Override
  public int getOffset() {
    return 2;
  }

  @Override
  public Z next() {
    return Fibonacci.fibonacci((super.next().intValue() + 3) / 2).subtract(1);
  }
}
