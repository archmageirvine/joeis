package irvine.oeis.a017;

import irvine.oeis.LinearRecurrence;

/**
 * A017606.
 * @author Sean A. Irvine
 */
public class A017606 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017606() {
    super(new long[] {1, -3, 3}, new long[] {49, 361, 961});
  }
}
