package irvine.oeis.a065;
// manually knest at 2023-03-02 11:48

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a000.A000010;

/**
 * A065451 a(n) = Fibonacci(phi(n)), a(0) = 0.
 * @author Georg Fischer
 */
public class A065451 extends A000010 {

  /** Construct the sequence. */
  public A065451() {
    super(0);
  }

  private int mN = -1;

  @Override
  public Z next() {
    return (++mN == 0) ? Z.ZERO : Functions.FIBONACCI.z(super.next());
  }
}

