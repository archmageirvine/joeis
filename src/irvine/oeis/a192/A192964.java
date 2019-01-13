package irvine.oeis.a192;

import irvine.oeis.LinearRecurrence;

/**
 * A192964.
 * @author Sean A. Irvine
 */
public class A192964 extends LinearRecurrence {

  /** Construct the sequence. */
  public A192964() {
    super(new long[] {1, -1, -2, 3}, new long[] {1, 0, 3, 7});
  }
}
