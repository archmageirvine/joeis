package irvine.oeis.a109;

import irvine.oeis.LinearRecurrence;

/**
 * A109046.
 * @author Sean A. Irvine
 */
public class A109046 extends LinearRecurrence {

  /** Construct the sequence. */
  public A109046() {
    super(new long[] {-1, 0, 0, 0, 0, 2, 0, 0, 0, 0}, new long[] {0, 5, 10, 15, 20, 5, 30, 35, 40, 45});
  }
}
