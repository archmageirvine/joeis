package irvine.oeis.a116;

import irvine.oeis.LinearRecurrence;

/**
 * A116476.
 * @author Sean A. Irvine
 */
public class A116476 extends LinearRecurrence {

  /** Construct the sequence. */
  public A116476() {
    super(new long[] {1, -1, 0, 0, -394, 394, 0, 0, 1}, new long[] {13, 46, 229, 1608, 7335, 20304, 92391, 635710, 2892133});
  }
}
