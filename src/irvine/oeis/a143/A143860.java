package irvine.oeis.a143;

import irvine.oeis.LinearRecurrence;

/**
 * A143860.
 * @author Sean A. Irvine
 */
public class A143860 extends LinearRecurrence {

  /** Construct the sequence. */
  public A143860() {
    super(new long[] {1, -3, 3}, new long[] {1, 16, 63});
  }
}
