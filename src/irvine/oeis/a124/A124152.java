package irvine.oeis.a124;

import irvine.oeis.LinearRecurrence;

/**
 * A124152 <code>a(n) =</code> Fibonacci(6, <code>n)</code>.
 * @author Sean A. Irvine
 */
public class A124152 extends LinearRecurrence {

  /** Construct the sequence. */
  public A124152() {
    super(new long[] {-1, 6, -15, 20, -15, 6}, new long[] {0, 8, 70, 360, 1292, 3640});
  }
}
