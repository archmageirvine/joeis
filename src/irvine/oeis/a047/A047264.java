package irvine.oeis.a047;

import irvine.oeis.LinearRecurrence;

/**
 * A047264 Numbers that are congruent to 0 or <code>5 mod 6</code>.
 * @author Sean A. Irvine
 */
public class A047264 extends LinearRecurrence {

  /** Construct the sequence. */
  public A047264() {
    super(new long[] {-1, 1, 1}, new long[] {0, 5, 6});
  }
}
