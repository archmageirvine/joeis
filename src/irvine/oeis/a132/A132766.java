package irvine.oeis.a132;

import irvine.oeis.LinearRecurrence;

/**
 * A132766 a(n) = n*(n+24).
 * @author Sean A. Irvine
 */
public class A132766 extends LinearRecurrence {

  /** Construct the sequence. */
  public A132766() {
    super(new long[] {1, -3, 3}, new long[] {0, 25, 52});
  }
}
