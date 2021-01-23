package irvine.oeis.a106;

import irvine.oeis.LinearRecurrence;

/**
 * A106627 Product L(n)*L_4(n), where L(n) are Lucas numbers and L_4(n) are Lucas 4-step numbers.
 * @author Sean A. Irvine
 */
public class A106627 extends LinearRecurrence {

  /** Construct the sequence. */
  public A106627() {
    super(new long[] {-1, 1, -2, 3, 9, 5, 4, 1}, new long[] {8, 1, 9, 28, 105, 286, 918, 2871});
  }
}
