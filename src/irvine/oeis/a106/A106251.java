package irvine.oeis.a106;

import irvine.oeis.LinearRecurrence;

/**
 * A106251.
 * @author Sean A. Irvine
 */
public class A106251 extends LinearRecurrence {

  /** Construct the sequence. */
  public A106251() {
    super(new long[] {-1, 1, 0, 0, 0, 0, 1}, new long[] {1, 0, 1, 2, 2, 3, 4});
  }
}
