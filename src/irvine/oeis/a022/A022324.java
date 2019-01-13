package irvine.oeis.a022;

import irvine.oeis.LinearRecurrence;

/**
 * A022324.
 * @author Sean A. Irvine
 */
public class A022324 extends LinearRecurrence {

  /** Construct the sequence. */
  public A022324() {
    super(new long[] {-1, 0, 2}, new long[] {1, 10, 12});
  }
}
