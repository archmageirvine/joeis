package irvine.oeis.a116;

import irvine.oeis.LinearRecurrence;

/**
 * A116744.
 * @author Sean A. Irvine
 */
public class A116744 extends LinearRecurrence {

  /** Construct the sequence. */
  public A116744() {
    super(new long[] {2, -13, 35, -52, 47, -26, 8}, new long[] {1, 2, 6, 21, 73, 242, 772});
  }
}
