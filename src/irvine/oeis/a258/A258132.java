package irvine.oeis.a258;

import irvine.oeis.LinearRecurrence;

/**
 * A258132 Octagonal numbers <code>(A000567)</code> that are the sum of fifteen consecutive octagonal numbers.
 * @author Sean A. Irvine
 */
public class A258132 extends LinearRecurrence {

  /** Construct the sequence. */
  public A258132() {
    super(new long[] {1, -1, -238142, 238142, 1}, new long[] {4715040, 8463840, 1122749669280L, 2015496399840L, 267373851637578960L});
  }
}
