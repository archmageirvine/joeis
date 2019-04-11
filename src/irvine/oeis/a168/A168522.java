package irvine.oeis.a168;

import irvine.oeis.LinearRecurrence;

/**
 * A168522 <code>a(n) = 98*a(n-1) - 2*a(n-2)</code>; <code>a(0) = 0, a(1) = 1</code>.
 * @author Sean A. Irvine
 */
public class A168522 extends LinearRecurrence {

  /** Construct the sequence. */
  public A168522() {
    super(new long[] {-2, 98}, new long[] {0, 1});
  }
}
