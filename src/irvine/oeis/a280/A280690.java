package irvine.oeis.a280;
// manually quots/quot at 2021-11-26 22:57

import irvine.oeis.QuotientSequence;
import irvine.oeis.a000.A000045;
import irvine.oeis.a105.A105800;

/**
 * A280690 a(n) = A000045(n) / A105800(n); the n-th Fibonacci number divided by its largest Fibonacci proper divisor.
 * @author Georg Fischer
 */
public class A280690 extends QuotientSequence {

  /** Construct the sequence. */
  public A280690() {
    super(new A000045(), new A105800(), 1, 0);
  }
}
