package irvine.oeis.a132;

import irvine.oeis.LinearRecurrence;

/**
 * A132761 <code>a(n) = n*(n+17)</code>.
 * @author Sean A. Irvine
 */
public class A132761 extends LinearRecurrence {

  /** Construct the sequence. */
  public A132761() {
    super(new long[] {1, -3, 3}, new long[] {0, 18, 38});
  }
}
