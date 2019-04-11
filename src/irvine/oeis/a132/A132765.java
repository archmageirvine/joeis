package irvine.oeis.a132;

import irvine.oeis.LinearRecurrence;

/**
 * A132765 <code>a(n) = n*(n + 23)</code>.
 * @author Sean A. Irvine
 */
public class A132765 extends LinearRecurrence {

  /** Construct the sequence. */
  public A132765() {
    super(new long[] {1, -3, 3}, new long[] {0, 24, 50});
  }
}
