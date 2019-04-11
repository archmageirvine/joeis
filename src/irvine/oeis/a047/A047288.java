package irvine.oeis.a047;

import irvine.oeis.LinearRecurrence;

/**
 * A047288 Numbers that are congruent to <code>{4, 6} mod 7</code>.
 * @author Sean A. Irvine
 */
public class A047288 extends LinearRecurrence {

  /** Construct the sequence. */
  public A047288() {
    super(new long[] {-1, 1, 1}, new long[] {4, 6, 11});
  }
}
