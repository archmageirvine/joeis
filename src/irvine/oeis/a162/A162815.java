package irvine.oeis.a162;

import irvine.oeis.LinearRecurrence;

/**
 * A162815 a(n) = 8*a(n-1)-13*a(n-2) for n &gt; 1; a(0) = 5, a(1) = 23.
 * @author Sean A. Irvine
 */
public class A162815 extends LinearRecurrence {

  /** Construct the sequence. */
  public A162815() {
    super(new long[] {-13, 8}, new long[] {5, 23});
  }
}
