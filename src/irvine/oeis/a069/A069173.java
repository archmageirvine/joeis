package irvine.oeis.a069;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A069173 Centered 22-gonal numbers.
 * @author Sean A. Irvine
 */
public class A069173 extends LinearRecurrence {

  /** Construct the sequence. */
  public A069173() {
    super(1, new long[] {1, -3, 3}, new long[] {1, 23, 67});
  }
}
