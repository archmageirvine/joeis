package irvine.oeis.a068;

import irvine.math.function.Functions;
import irvine.math.z.Fibonacci;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A068096 a(n) = F(L(n)) where F(n) = n-th Fibonacci number and L(n) = n-th Lucas number.
 * @author Georg Fischer
 */
public class A068096 extends Sequence0 {

  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    return Fibonacci.fibonacci(Functions.LUCAS.l(mN));
  }
}
