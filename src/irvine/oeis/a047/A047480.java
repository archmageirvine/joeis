package irvine.oeis.a047;

import irvine.oeis.LinearRecurrence;

/**
 * A047480 Numbers that are congruent to <code>{2, 5, 7} mod 8</code>.
 * @author Sean A. Irvine
 */
public class A047480 extends LinearRecurrence {

  /** Construct the sequence. */
  public A047480() {
    super(new long[] {-1, 1, 0, 1}, new long[] {2, 5, 7, 10});
  }
}
