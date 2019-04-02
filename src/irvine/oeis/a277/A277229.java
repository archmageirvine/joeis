package irvine.oeis.a277;

import irvine.oeis.LinearRecurrence;

/**
 * A277229 Convolution of the odd indexed triangular numbers (A000384(n+1)) and the squares (A000290).
 * @author Sean A. Irvine
 */
public class A277229 extends LinearRecurrence {

  /** Construct the sequence. */
  public A277229() {
    super(new long[] {-1, 6, -15, 20, -15, 6}, new long[] {0, 1, 10, 48, 158, 413});
  }
}
