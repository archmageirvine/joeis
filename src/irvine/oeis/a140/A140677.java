package irvine.oeis.a140;

import irvine.oeis.LinearRecurrence;

/**
 * A140677 <code>a(n) = n*(3*n + 8)</code>.
 * @author Sean A. Irvine
 */
public class A140677 extends LinearRecurrence {

  /** Construct the sequence. */
  public A140677() {
    super(new long[] {1, -3, 3}, new long[] {0, 11, 28});
  }
}
