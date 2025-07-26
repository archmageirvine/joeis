package irvine.oeis.a169;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.TwoParameterFormSequence;

/**
 * A169694 Numbers of the form Fibonacci(i) + Fibonacci(j), where i and j have opposite parity and |i-j| &gt; 1.
 * @author Sean A. Irvine
 */
public class A169694 extends TwoParameterFormSequence {

  /** Construct the sequence. */
  public A169694() {
    super(1, 0, 1, (i, j) -> Functions.FIBONACCI.z(i).add(Functions.FIBONACCI.z(j)));
  }

  @Override
  protected boolean accept(final long i, final long j, final Z n, final Z prev) {
    return (i & 1) != (j & 1) && Math.abs(i - j) > 1 && !n.equals(prev);
  }
}

