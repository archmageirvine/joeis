package irvine.oeis.a082;

import irvine.oeis.LinearRecurrence;

/**
 * A082365 A Jacobsthal number sequence.
 * @author Sean A. Irvine
 */
public class A082365 extends LinearRecurrence {

  /** Construct the sequence. */
  public A082365() {
    super(new long[] {8, 7}, new long[] {1, 11});
  }
}
