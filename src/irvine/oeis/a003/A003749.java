package irvine.oeis.a003;

import irvine.oeis.LinearRecurrence;

/**
 * A003749.
 * @author Sean A. Irvine
 */
public class A003749 extends LinearRecurrence {

  /** Construct the sequence. */
  public A003749() {
    super(new long[]{0, 12, 28}, new long[] {12, 480, 13440});
  }
}
