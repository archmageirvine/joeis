package irvine.oeis.a118;

import irvine.oeis.LinearRecurrence;

/**
 * A118061.
 * @author Sean A. Irvine
 */
public class A118061 extends LinearRecurrence {

  /** Construct the sequence. */
  public A118061() {
    super(new long[] {1, -3, 3}, new long[] {1, 23661, 66921});
  }
}
