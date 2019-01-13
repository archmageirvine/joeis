package irvine.oeis.a080;

import irvine.oeis.LinearRecurrence;

/**
 * A080002.
 * @author Sean A. Irvine
 */
public class A080002 extends LinearRecurrence {

  /** Construct the sequence. */
  public A080002() {
    super(new long[] {-1, 0, 0, -1, -1, 2, 1, 0, 1, 0}, new long[] {1, 0, 0, 0, 1, 1, 0, 0, 1, 3});
  }
}
