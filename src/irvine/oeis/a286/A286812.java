package irvine.oeis.a286;

import irvine.oeis.LinearRecurrence;

/**
 * A286812 a(n) = 105 - 2^n.
 * @author Sean A. Irvine
 */
public class A286812 extends LinearRecurrence {

  /** Construct the sequence. */
  public A286812() {
    super(new long[] {-2, 3}, new long[] {104, 103});
  }
}
