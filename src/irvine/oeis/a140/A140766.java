package irvine.oeis.a140;

import irvine.oeis.LinearRecurrence;

/**
 * A140766.
 * @author Sean A. Irvine
 */
public class A140766 extends LinearRecurrence {

  /** Construct the sequence. */
  public A140766() {
    super(new long[] {-6, 6}, new long[] {1, 5});
  }
}
