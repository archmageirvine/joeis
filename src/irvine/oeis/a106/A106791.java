package irvine.oeis.a106;

import irvine.oeis.LinearRecurrence;

/**
 * A106791 Sum of two consecutive squares of Lucas 4-step numbers (A073817).
 * @author Sean A. Irvine
 */
public class A106791 extends LinearRecurrence {

  /** Construct the sequence. */
  public A106791() {
    super(new long[] {1, 0, -2, 0, -6, -4, 12, 6, 4, 2}, new long[] {17, 10, 58, 274, 901, 3277, 12402, 46282, 171170, 635953});
  }
}
