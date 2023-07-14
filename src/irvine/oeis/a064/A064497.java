package irvine.oeis.a064;

import irvine.oeis.Combiner;
import irvine.oeis.a000.A000040;
import irvine.oeis.a000.A000045;

/**
 * A064497 a(n) = prime(n) * Fibonacci(n).
 * @author Sean A. Irvine
 */
public class A064497 extends Combiner {

  /** Construct the sequence. */
  public A064497() {
    super(new A000040(), new A000045().skip(), MULTIPLY);
  }
}
