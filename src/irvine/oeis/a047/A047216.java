package irvine.oeis.a047;

import irvine.oeis.LinearRecurrence;

/**
 * A047216 Numbers that are congruent to {1, 2} mod 5.
 * @author Sean A. Irvine
 */
public class A047216 extends LinearRecurrence {

  /** Construct the sequence. */
  public A047216() {
    super(new long[] {-1, 1, 1}, new long[] {1, 2, 6});
  }
}
