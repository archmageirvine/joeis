package irvine.oeis.a360;
// Generated by gen_seq4.pl simbinom at 2023-03-17 21:33

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A360467 a(n) = Fibonacci(4*n+2) + 3*Fibonacci(2*n+1)^2.
 * @author Georg Fischer
 */
public class A360467 extends AbstractSequence {

  private int mN = -1;

  /** Construct the sequence. */
  public A360467() {
    super(0);
  }

  @Override
  public Z next() {
    ++mN;
    return Functions.FIBONACCI.z(4L * mN + 2).add(Functions.FIBONACCI.z(2L * mN + 1).square().multiply(3));
  }
}
