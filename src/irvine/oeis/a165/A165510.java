package irvine.oeis.a165;

import irvine.oeis.LinearRecurrence;

/**
 * A165510 <code>a(0)=1, a(1)=9, a(n) = 72*a(n-2) - a(n-1)</code>.
 * @author Sean A. Irvine
 */
public class A165510 extends LinearRecurrence {

  /** Construct the sequence. */
  public A165510() {
    super(new long[] {72, -1}, new long[] {1, 9});
  }
}
