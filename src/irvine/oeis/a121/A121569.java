package irvine.oeis.a121;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A121569 a(n) = Fibonacci((prime(n)+3)/2) - 1.
 * @author Georg Fischer
 */
public class A121569 extends A000040 {

  {
    setOffset(2);
    super.next();
  }

  @Override
  public Z next() {
    return Functions.FIBONACCI.z((super.next().intValue() + 3) / 2).subtract(1);
  }
}
