package irvine.oeis.a098;

import irvine.oeis.LinearRecurrence;

/**
 * A098847 <code>a(n) = n(n + 12)</code>.
 * @author Sean A. Irvine
 */
public class A098847 extends LinearRecurrence {

  /** Construct the sequence. */
  public A098847() {
    super(new long[] {1, -3, 3}, new long[] {0, 13, 28});
  }
}
