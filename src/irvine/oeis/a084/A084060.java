package irvine.oeis.a084;

import irvine.oeis.LinearRecurrence;

/**
 * A084060.
 * @author Sean A. Irvine
 */
public class A084060 extends LinearRecurrence {

  /** Construct the sequence. */
  public A084060() {
    super(new long[] {1, 1, -1}, new long[] {1, 3, -5});
  }
}
