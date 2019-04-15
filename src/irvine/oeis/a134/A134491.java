package irvine.oeis.a134;

import irvine.oeis.LinearRecurrence;

/**
 * A134491 <code>Fibonacci(5n+4)</code>.
 * @author Sean A. Irvine
 */
public class A134491 extends LinearRecurrence {

  /** Construct the sequence. */
  public A134491() {
    super(new long[] {1, 11}, new long[] {3, 34});
  }
}
