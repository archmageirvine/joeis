package irvine.oeis.a080;

import irvine.oeis.LinearRecurrence;

/**
 * A080341 Sum of the n first terms that are congruent to <code>1, 4</code> or <code>5 mod 6 (A047259)</code>.
 * @author Sean A. Irvine
 */
public class A080341 extends LinearRecurrence {

  /** Construct the sequence. */
  public A080341() {
    super(new long[] {1, -2, 1, -1, 2}, new long[] {1, 5, 10, 17, 27});
  }
}
