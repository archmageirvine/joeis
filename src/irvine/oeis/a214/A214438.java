package irvine.oeis.a214;

import irvine.oeis.LinearRecurrence;

/**
 * A214438.
 * @author Sean A. Irvine
 */
public class A214438 extends LinearRecurrence {

  /** Construct the sequence. */
  public A214438() {
    super(new long[] {-1, 0, 1, 0}, new long[] {1, 1, 2, 1});
  }
}
