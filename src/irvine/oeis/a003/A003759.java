package irvine.oeis.a003;

import irvine.oeis.LinearRecurrence;

/**
 * A003759.
 * @author Sean A. Irvine
 */
public class A003759 extends LinearRecurrence {

  /** Construct the sequence. */
  public A003759() {
    super(new long[]{1, -2, 3, 3}, new long[]{0, 2, 6, 24});
  }
}
