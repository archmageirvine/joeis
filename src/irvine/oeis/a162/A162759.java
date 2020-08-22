package irvine.oeis.a162;

import irvine.oeis.LinearRecurrence;

/**
 * A162759 a(n) = 16*a(n-1)-61*a(n-2) for n &gt; 1; a(0) = 1, a(1) = 9.
 * @author Sean A. Irvine
 */
public class A162759 extends LinearRecurrence {

  /** Construct the sequence. */
  public A162759() {
    super(new long[] {-61, 16}, new long[] {1, 9});
  }
}
