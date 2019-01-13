package irvine.oeis.a143;

import irvine.oeis.LinearRecurrence;

/**
 * A143938.
 * @author Sean A. Irvine
 */
public class A143938 extends LinearRecurrence {

  /** Construct the sequence. */
  public A143938() {
    super(new long[] {-1, 4, -6, 4}, new long[] {27, 109, 279, 569});
  }
}
