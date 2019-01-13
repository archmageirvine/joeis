package irvine.oeis.a006;

import irvine.oeis.LinearRecurrence;

/**
 * A006189.
 * @author Sean A. Irvine
 */
public class A006189 extends LinearRecurrence {

  // Conjectured recurrence

  /** Construct the sequence. */
  public A006189() {
    super(new long[] {1, 2, -3, 4}, new long[] {1, 1, 3, 11});
  }
}

