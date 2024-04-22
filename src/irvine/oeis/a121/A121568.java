package irvine.oeis.a121;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A121568 Fibonacci[ (p - 1)/2 ], where p = Prime[n].
 * @author Georg Fischer
 */
public class A121568 extends A000040 {

  {
    setOffset(2);
    super.next();
  }

  @Override
  public Z next() {
    return Functions.FIBONACCI.z((super.next().intValue() - 1) / 2);
  }
}
