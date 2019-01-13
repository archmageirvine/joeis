package irvine.oeis.a003;

import irvine.oeis.LinearRecurrence;

/**
 * A003771.
 * @author Sean A. Irvine
 */
public class A003771 extends LinearRecurrence {

  /** Construct the sequence. */
  public A003771() {
    super(new long[]{0, -2, 7}, new long[]{3, 30, 198});
  }
}
