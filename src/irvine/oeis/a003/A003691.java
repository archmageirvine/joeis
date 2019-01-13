package irvine.oeis.a003;

import irvine.oeis.LinearRecurrence;

/**
 * A003691.
 * @author Sean A. Irvine
 */
public class A003691 extends LinearRecurrence {

  /** Construct the sequence. */
  public A003691() {
    super(new long[] {0, 8, 8}, new long[] {3, 36, 324});
  }
}
