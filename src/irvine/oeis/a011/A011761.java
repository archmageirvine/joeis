package irvine.oeis.a011;

import irvine.oeis.LinearRecurrence;

/**
 * A011761 <code>a(n) = a(n-1) + a(n-3)</code>, with <code>a(0) = a(1) = 1, a(2) = 5</code>.
 * @author Sean A. Irvine
 */
public class A011761 extends LinearRecurrence {

  /** Construct the sequence. */
  public A011761() {
    super(new long[] {1, 0, 1}, new long[] {1, 1, 5});
  }
}
