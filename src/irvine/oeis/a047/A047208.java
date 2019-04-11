package irvine.oeis.a047;

import irvine.oeis.LinearRecurrence;

/**
 * A047208 Numbers that are congruent to <code>{0, 4} mod 5</code>.
 * @author Sean A. Irvine
 */
public class A047208 extends LinearRecurrence {

  /** Construct the sequence. */
  public A047208() {
    super(new long[] {-1, 1, 1}, new long[] {0, 4, 5});
  }
}
