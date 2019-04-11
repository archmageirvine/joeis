package irvine.oeis.a137;

import irvine.oeis.LinearRecurrence;

/**
 * A137483 <code>a(n+1) = 9*a(n) - 6, a(0) = 2</code>.
 * @author Sean A. Irvine
 */
public class A137483 extends LinearRecurrence {

  /** Construct the sequence. */
  public A137483() {
    super(new long[] {-9, 10}, new long[] {2, 12});
  }
}
