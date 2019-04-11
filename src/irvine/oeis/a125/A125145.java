package irvine.oeis.a125;

import irvine.oeis.LinearRecurrence;

/**
 * A125145 <code>a(n) = 3a(n-1) + 3a(n-2)</code>. <code>a(0) = 1, a(1) = 4</code>.
 * @author Sean A. Irvine
 */
public class A125145 extends LinearRecurrence {

  /** Construct the sequence. */
  public A125145() {
    super(new long[] {3, 3}, new long[] {1, 4});
  }
}
