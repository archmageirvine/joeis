package irvine.oeis.a007;

import irvine.math.z.Fibonacci;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A007570 a(n) = F(F(n)), where F is a Fibonacci number.
 * @author Sean A. Irvine
 */
public class A007570 extends AbstractSequence {

  /* Construct the sequence. */
  public A007570() {
    super(0);
  }

  private int mN = -1;

  @Override
  public Z next() {
    return Fibonacci.fibonacci(Fibonacci.fibonacci(++mN).intValueExact());
  }
}
