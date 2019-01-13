package irvine.oeis.a003;

import irvine.oeis.LinearRecurrence;

/**
 * A003775.
 * @author Sean A. Irvine
 */
public class A003775 extends LinearRecurrence {

  /** Construct the sequence. */
  public A003775() {
    super(new long[]{0, -1, 15, -32, 15}, new long[]{1, 8, 95, 1183, 14824});
  }
}
