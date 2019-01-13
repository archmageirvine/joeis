package irvine.oeis.a192;

import irvine.oeis.LinearRecurrence;

/**
 * A192333.
 * @author Sean A. Irvine
 */
public class A192333 extends LinearRecurrence {

  /** Construct the sequence. */
  public A192333() {
    super(new long[] {-1, 1, 0, 0, 0, 1}, new long[] {0, 2, 4, 6, 8, 15});
  }
}
