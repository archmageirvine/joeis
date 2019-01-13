package irvine.oeis.a192;

import irvine.oeis.LinearRecurrence;

/**
 * A192781.
 * @author Sean A. Irvine
 */
public class A192781 extends LinearRecurrence {

  /** Construct the sequence. */
  public A192781() {
    super(new long[] {1, 1, -3, -1, 3, 1}, new long[] {0, 1, 0, 2, 1, 4});
  }
}
