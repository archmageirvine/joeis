package irvine.oeis.a275;

import irvine.oeis.LinearRecurrence;

/**
 * A275634.
 * @author Sean A. Irvine
 */
public class A275634 extends LinearRecurrence {

  /** Construct the sequence. */
  public A275634() {
    super(new long[] {-3, -2, 5}, new long[] {3, 13, 57});
  }
}
