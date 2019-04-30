package irvine.oeis.a178;

import irvine.oeis.LinearRecurrence;

/**
 * A178765 <code>a(n) = 17*a(n-1) + a(n-2)</code>, with <code>a(-1) = 0</code> and <code>a(0) = 1</code>.
 * @author Sean A. Irvine
 */
public class A178765 extends LinearRecurrence {

  /** Construct the sequence. */
  public A178765() {
    super(new long[] {1, 17}, new long[] {0, 1});
  }
}
