package irvine.oeis.a082;

import irvine.oeis.LinearRecurrence;

/**
 * A082369 Numbers congruent to <code>13 mod 30</code>.
 * @author Sean A. Irvine
 */
public class A082369 extends LinearRecurrence {

  /** Construct the sequence. */
  public A082369() {
    super(new long[] {-1, 2}, new long[] {13, 43});
  }
}
