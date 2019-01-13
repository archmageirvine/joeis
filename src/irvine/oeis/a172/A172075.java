package irvine.oeis.a172;

import irvine.oeis.LinearRecurrence;

/**
 * A172075.
 * @author Sean A. Irvine
 */
public class A172075 extends LinearRecurrence {

  /** Construct the sequence. */
  public A172075() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {0, 1, 29, 146, 450});
  }
}
