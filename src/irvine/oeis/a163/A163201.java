package irvine.oeis.a163;

import irvine.oeis.LinearRecurrence;

/**
 * A163201 Alternating sum of the cubes of the first n even-indexed Fibonacci numbers.
 * @author Sean A. Irvine
 */
public class A163201 extends LinearRecurrence {

  /** Construct the sequence. */
  public A163201() {
    super(new long[] {1, 20, 35, -35, -20}, new long[] {0, -1, 26, -486, 8775});
  }
}
