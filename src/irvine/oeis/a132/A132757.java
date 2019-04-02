package irvine.oeis.a132;

import irvine.oeis.LinearRecurrence;

/**
 * A132757 a(n) = n(n+29)/2.
 * @author Sean A. Irvine
 */
public class A132757 extends LinearRecurrence {

  /** Construct the sequence. */
  public A132757() {
    super(new long[] {1, -3, 3}, new long[] {0, 15, 31});
  }
}
