package irvine.oeis.a003;

import irvine.oeis.LinearRecurrence;

/**
 * A003756.
 * @author Sean A. Irvine
 */
public class A003756 extends LinearRecurrence {

  /** Construct the sequence. */
  public A003756() {
    super(new long[]{0, 0, 4, 16, 2}, new long[]{1, 0, 24, 54, 492});
  }
}
