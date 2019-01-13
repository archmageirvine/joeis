package irvine.oeis.a289;

import irvine.oeis.LinearRecurrence;

/**
 * A289195.
 * @author Sean A. Irvine
 */
public class A289195 extends LinearRecurrence {

  /** Construct the sequence. */
  public A289195() {
    super(new long[] {-1, 1, 0, 0, 0, 1}, new long[] {0, 0, 2, 2, 2, 4});
  }
}
