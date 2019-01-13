package irvine.oeis.a017;

import irvine.oeis.LinearRecurrence;

/**
 * A017901.
 * @author Sean A. Irvine
 */
public class A017901 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017901() {
    super(new long[] {1, 0, 0, 0, 0, 0, 1}, new long[] {1, 0, 0, 0, 0, 0, 0});
  }
}
