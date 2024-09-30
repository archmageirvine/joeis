package irvine.oeis.a000;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.DirectSequence;

/**
 * A000071 a(n) = Fibonacci(n) - 1.
 * @author Sean A. Irvine
 */
public class A000071 extends A000045 implements DirectSequence {

  {
    setOffset(1);
  }

  /** Construct the sequence. */
  public A000071() {
    super.next();
  }

  @Override
  public Z next() {
    return super.next().subtract(Z.ONE);
  }

  @Override
  public Z a(final Z n) {
    return Functions.FIBONACCI.z(n).subtract(1);
  }

  @Override
  public Z a(final int n) {
    return Functions.FIBONACCI.z(n).subtract(1);
  }

}

