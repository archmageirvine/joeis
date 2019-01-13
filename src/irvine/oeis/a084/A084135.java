package irvine.oeis.a084;

import irvine.oeis.LinearRecurrence;

/**
 * A084135.
 * @author Sean A. Irvine
 */
public class A084135 extends LinearRecurrence {

  /** Construct the sequence. */
  public A084135() {
    super(new long[] {-15, 10}, new long[] {1, 5});
  }
}
