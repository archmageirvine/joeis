package irvine.oeis.a132;

import irvine.oeis.LinearRecurrence;

/**
 * A132764 <code>a(n) = n(n+22)</code>.
 * @author Sean A. Irvine
 */
public class A132764 extends LinearRecurrence {

  /** Construct the sequence. */
  public A132764() {
    super(new long[] {1, -3, 3}, new long[] {0, 23, 48});
  }
}
