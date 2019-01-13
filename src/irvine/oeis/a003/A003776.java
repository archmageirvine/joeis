package irvine.oeis.a003;

import irvine.oeis.LinearRecurrence;

/**
 * A003776.
 * @author Sean A. Irvine
 */
public class A003776 extends LinearRecurrence {

  /** Construct the sequence. */
  public A003776() {
    super(new long[]{26, -57, 24}, new long[]{3, 54, 1140});
  }
}
