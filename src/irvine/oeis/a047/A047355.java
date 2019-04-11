package irvine.oeis.a047;

import irvine.oeis.LinearRecurrence;

/**
 * A047355 Numbers that are congruent to <code>{0, 3} mod 7</code>.
 * @author Sean A. Irvine
 */
public class A047355 extends LinearRecurrence {

  /** Construct the sequence. */
  public A047355() {
    super(new long[] {-1, 1, 1}, new long[] {0, 3, 7});
  }
}
