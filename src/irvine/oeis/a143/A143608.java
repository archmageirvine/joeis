package irvine.oeis.a143;

import irvine.oeis.LinearRecurrence;

/**
 * A143608.
 * @author Sean A. Irvine
 */
public class A143608 extends LinearRecurrence {

  /** Construct the sequence. */
  public A143608() {
    super(new long[] {-1, 0, 6, 0}, new long[] {0, 1, 4, 7});
  }
}
