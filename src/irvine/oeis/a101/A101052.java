package irvine.oeis.a101;

import irvine.oeis.LinearRecurrence;

/**
 * A101052.
 * @author Sean A. Irvine
 */
public class A101052 extends LinearRecurrence {

  /** Construct the sequence. */
  public A101052() {
    super(new long[] {6, -11, 6}, new long[] {1, 1, 3});
  }
}
