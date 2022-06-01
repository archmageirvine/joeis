package irvine.oeis.a069;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A069129 Centered 16-gonal numbers.
 * @author Sean A. Irvine
 */
public class A069129 extends LinearRecurrence {

  /** Construct the sequence. */
  public A069129() {
    super(new long[] {1, -3, 3}, new long[] {1, 17, 49});
  }
}
