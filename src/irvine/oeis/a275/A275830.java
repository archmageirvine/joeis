package irvine.oeis.a275;

import irvine.oeis.LinearRecurrence;

/**
 * A275830.
 * @author Sean A. Irvine
 */
public class A275830 extends LinearRecurrence {

  /** Construct the sequence. */
  public A275830() {
    super(new long[] {49, 0, -7}, new long[] {3, -7, 49});
  }
}
