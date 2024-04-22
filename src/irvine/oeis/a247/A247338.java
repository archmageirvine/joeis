package irvine.oeis.a247;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A247338 a(n) = Fibonacci(n) concatenated with Lucas(n).
 * @author Georg Fischer
 */
public class A247338 extends Sequence0 {

  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    return new Z(Functions.FIBONACCI.z((long) mN).toString() + Functions.LUCAS.z((long) mN).toString());
  }
}
