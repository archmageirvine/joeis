package irvine.oeis.a082;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A082369 Numbers congruent to 13 mod 30.
 * @author Sean A. Irvine
 */
public class A082369 extends LinearRecurrence {

  /** Construct the sequence. */
  public A082369() {
    super(1, new long[] {-1, 2}, new long[] {13, 43});
  }
}
