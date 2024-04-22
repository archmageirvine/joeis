package irvine.oeis.a322;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a001.A001358;

/**
 * A322303 a(n) = Fibonacci(semiprime(n)).
 * @author Georg Fischer
 */
public class A322303 extends A001358 {

  @Override
  public Z next() {
    return Functions.FIBONACCI.z(super.next());
  }
}
