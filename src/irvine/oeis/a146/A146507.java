package irvine.oeis.a146;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A146507 Numbers congruent to {1, 13} mod 42.
 * @author Sean A. Irvine
 */
public class A146507 extends LinearRecurrence {

  /** Construct the sequence. */
  public A146507() {
    super(1, new long[] {-1, 1, 1}, new long[] {1, 13, 43});
  }
}
