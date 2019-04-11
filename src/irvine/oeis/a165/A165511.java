package irvine.oeis.a165;

import irvine.oeis.LinearRecurrence;

/**
 * A165511 <code>a(0)=1, a(1)=10, a(n) = 90*a(n-2) - a(n-1)</code>.
 * @author Sean A. Irvine
 */
public class A165511 extends LinearRecurrence {

  /** Construct the sequence. */
  public A165511() {
    super(new long[] {90, -1}, new long[] {1, 10});
  }
}
