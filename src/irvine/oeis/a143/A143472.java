package irvine.oeis.a143;

import irvine.oeis.LinearRecurrence;

/**
 * A143472.
 * @author Sean A. Irvine
 */
public class A143472 extends LinearRecurrence {

  /** Construct the sequence. */
  public A143472() {
    super(new long[] {-1, 0, 0, 1, 0, 1, 0, 1, 0, 0}, new long[] {1, 0, 0, 1, 0, 1, 1, 1, 2, 1});
  }
}
