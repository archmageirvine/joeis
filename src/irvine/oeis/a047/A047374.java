package irvine.oeis.a047;

import irvine.oeis.LinearRecurrence;

/**
 * A047374 Numbers that are congruent to <code>{4, 5} mod 7</code>.
 * @author Sean A. Irvine
 */
public class A047374 extends LinearRecurrence {

  /** Construct the sequence. */
  public A047374() {
    super(new long[] {-1, 1, 1}, new long[] {4, 5, 11});
  }
}
