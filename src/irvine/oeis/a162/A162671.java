package irvine.oeis.a162;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A162671 Generalized Fibonacci numbers.
 * @author Georg Fischer
 * @author Sean A. Irvine
 */
public class A162671 extends LinearRecurrence {

  /** Construct the sequence. */
  public A162671() {
    super(0, new long[] {-1, 0, 102, 0}, new long[] {0, 1, 1, 101});
  }
}
