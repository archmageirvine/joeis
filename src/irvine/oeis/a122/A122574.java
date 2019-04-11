package irvine.oeis.a122;

import irvine.oeis.LinearRecurrence;

/**
 * A122574 <code>a(1) = a(2) = 1, a(n) = -11a(n-1) + a(n-2)</code>.
 * @author Sean A. Irvine
 */
public class A122574 extends LinearRecurrence {

  /** Construct the sequence. */
  public A122574() {
    super(new long[] {1, -11}, new long[] {1, 1});
  }
}
