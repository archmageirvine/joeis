package irvine.oeis.a203;
// Generated by gen_seq4.pl simbinom at 2023-03-17 21:33

import irvine.factor.factor.Jaguar;
import irvine.math.z.Fibonacci;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A203847 a(n) = tau(n)*Fibonacci(n), where tau(n) = A000005(n), the number of divisors of n.
 * @author Georg Fischer
 */
public class A203847 extends AbstractSequence {

  private int mN = 0;

  /** Construct the sequence. */
  public A203847() {
    super(1);
  }

  @Override
  public Z next() {
    ++mN;
    return Jaguar.factor(mN).tau().multiply(Fibonacci.fibonacci(mN));
  }
}
