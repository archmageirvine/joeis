package irvine.oeis.a106;

import irvine.oeis.LinearRecurrence;

/**
 * A106523 Diagonal sums of number triangle <code>A106522</code>.
 * @author Sean A. Irvine
 */
public class A106523 extends LinearRecurrence {

  /** Construct the sequence. */
  public A106523() {
    super(new long[] {-1, 0, 1, 3, 0}, new long[] {1, 1, 3, 4, 10});
  }
}
