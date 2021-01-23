package irvine.oeis.a162;

import irvine.oeis.LinearRecurrence;

/**
 * A162816 a(n) = 12*a(n-1)-33*a(n-2) for n &gt; 1; a(0) = 5, a(1) = 33.
 * @author Sean A. Irvine
 */
public class A162816 extends LinearRecurrence {

  /** Construct the sequence. */
  public A162816() {
    super(new long[] {-33, 12}, new long[] {5, 33});
  }
}
