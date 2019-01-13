package irvine.oeis.a017;

import irvine.oeis.LinearRecurrence;

/**
 * A017534.
 * @author Sean A. Irvine
 */
public class A017534 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017534() {
    super(new long[] {1, -3, 3}, new long[] {1, 169, 625});
  }
}
