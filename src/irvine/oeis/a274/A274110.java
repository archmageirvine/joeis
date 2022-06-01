package irvine.oeis.a274;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A274110 Number of equivalence classes of ballot paths of length n for the string uu.
 * @author Sean A. Irvine
 */
public class A274110 extends LinearRecurrence {

  /** Construct the sequence. */
  public A274110() {
    super(new long[] {-1, 1, -1, 0, 2}, new long[] {1, 2, 3, 5, 8});
  }
}
