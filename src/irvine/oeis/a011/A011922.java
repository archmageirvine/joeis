package irvine.oeis.a011;

import irvine.oeis.LinearRecurrence;

/**
 * A011922 <code>a(n) = 15*a(n-1) - 15*a(n-2) + a(n-3)</code>.
 * @author Sean A. Irvine
 */
public class A011922 extends LinearRecurrence {

  /** Construct the sequence. */
  public A011922() {
    super(new long[] {1, -15, 15}, new long[] {1, 3, 33});
  }
}
