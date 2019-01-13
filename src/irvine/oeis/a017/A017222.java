package irvine.oeis.a017;

import irvine.oeis.LinearRecurrence;

/**
 * A017222.
 * @author Sean A. Irvine
 */
public class A017222 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017222() {
    super(new long[] {1, -3, 3}, new long[] {25, 196, 529});
  }
}
