package irvine.oeis.a135;

import irvine.oeis.LinearRecurrence;

/**
 * A135435 <code>a(n) = a(n-4) + a(n-7)</code> with <code>a(0)</code>, ..., <code>a(6) = [7,0,0,0,4,0,0]</code>.
 * @author Sean A. Irvine
 */
public class A135435 extends LinearRecurrence {

  /** Construct the sequence. */
  public A135435() {
    super(new long[] {1, 0, 0, 1, 0, 0, 0}, new long[] {7, 0, 0, 0, 4, 0, 0});
  }
}
