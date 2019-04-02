package irvine.oeis.a279;

import irvine.oeis.LinearRecurrence;

/**
 * A279312 Number of subsets of {1, 2, 3, ..., n} that include no consecutive even integers.
 * @author Sean A. Irvine
 */
public class A279312 extends LinearRecurrence {

  /** Construct the sequence. */
  public A279312() {
    super(new long[] {4, 0, 2, 0}, new long[] {1, 2, 4, 8});
  }
}
