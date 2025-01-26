package irvine.oeis.a074;

import irvine.math.function.Functions;
import irvine.oeis.FilterPositionSequence;
import irvine.oeis.a000.A000045;

/**
 * A074697 Fibonacci(k) has more than k divisors (k such that A000005(A000045(k)) &gt; k).
 * @author Sean A. Irvine
 */
public class A074697 extends FilterPositionSequence {

  /** Construct the sequence. */
  public A074697() {
    super(1, 1, new A000045().skip(), (n, k) -> Functions.SIGMA0.z(k).compareTo(n) > 0);
  }
}
