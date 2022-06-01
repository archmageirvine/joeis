package irvine.oeis.a069;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A069126 Centered 13-gonal numbers.
 * @author Sean A. Irvine
 */
public class A069126 extends LinearRecurrence {

  /** Construct the sequence. */
  public A069126() {
    super(new long[] {1, -3, 3}, new long[] {1, 14, 40});
  }
}
