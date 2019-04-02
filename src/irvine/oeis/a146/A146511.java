package irvine.oeis.a146;

import irvine.oeis.LinearRecurrence;

/**
 * A146511 Numbers congruent to {5, 17} modulo 66.
 * @author Sean A. Irvine
 */
public class A146511 extends LinearRecurrence {

  /** Construct the sequence. */
  public A146511() {
    super(new long[] {-1, 1, 1}, new long[] {5, 17, 71});
  }
}
