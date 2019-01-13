package irvine.oeis.a003;

import irvine.oeis.LinearRecurrence;

/**
 * A003769.
 * @author Sean A. Irvine
 */
public class A003769 extends LinearRecurrence {

  /** Construct the sequence. */
  public A003769() {
    super(new long[]{-1, 4, 4}, new long[]{3, 16, 75});
  }
}
