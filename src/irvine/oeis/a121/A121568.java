package irvine.oeis.a121;

import irvine.math.z.Fibonacci;
import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A121568 Fibonacci[ (p - 1)/2 ], where p = Prime[n].
 * @author Georg Fischer
 */
public class A121568 extends A000040 {

  {
    super.next();
  }

  @Override
  public int getOffset() {
    return 2;
  }

  @Override
  public Z next() {
    return Fibonacci.fibonacci((super.next().intValue() - 1) / 2);
  }
}
