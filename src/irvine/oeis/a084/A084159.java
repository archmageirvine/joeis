package irvine.oeis.a084;

import irvine.oeis.LinearRecurrence;

/**
 * A084159.
 * @author Sean A. Irvine
 */
public class A084159 extends LinearRecurrence {

  /** Construct the sequence. */
  public A084159() {
    super(new long[] {-1, 5, 5}, new long[] {1, 3, 21});
  }
}
