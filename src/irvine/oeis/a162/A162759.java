package irvine.oeis.a162;

import irvine.oeis.LinearRecurrence;

/**
 * A162759 <code>a(n) = 16*a(n-1)-61*a(n-2)</code> for <code>n &gt; 1</code>; <code>a(0) = 1, a(1) = 9</code>.
 * @author Sean A. Irvine
 */
public class A162759 extends LinearRecurrence {

  /** Construct the sequence. */
  public A162759() {
    super(new long[] {-61, 16}, new long[] {1, 9});
  }
}
