package irvine.oeis.a128;

import irvine.oeis.LinearRecurrence;

/**
 * A128961.
 * @author Sean A. Irvine
 */
public class A128961 extends LinearRecurrence {

  /** Construct the sequence. */
  public A128961() {
    super(new long[] {-81, 108, -54, 12}, new long[] {0, 54, 648, 4860});
  }
}
