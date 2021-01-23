package irvine.oeis.a162;

import irvine.oeis.LinearRecurrence;

/**
 * A162396 a(n) = 2*a(n-2) for n &gt; 2; a(1) = 5, a(2) = 2.
 * @author Sean A. Irvine
 */
public class A162396 extends LinearRecurrence {

  /** Construct the sequence. */
  public A162396() {
    super(new long[] {2, 0}, new long[] {5, 2});
  }
}
