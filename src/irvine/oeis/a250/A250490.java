package irvine.oeis.a250;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A250490 (n^4)-th Fibonacci number.
 * @author Georg Fischer
 */
public class A250490 extends Sequence0 {

  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    return Functions.FIBONACCI.z(mN * mN * mN * mN);
  }
}
