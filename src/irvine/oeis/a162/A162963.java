package irvine.oeis.a162;

import irvine.oeis.LinearRecurrence;

/**
 * A162963 a(n) = 5*a(n-2) for n &gt; 2; a(1) = 2, a(2) = 5.
 * @author Sean A. Irvine
 */
public class A162963 extends LinearRecurrence {

  /** Construct the sequence. */
  public A162963() {
    super(new long[] {5, 0}, new long[] {2, 5});
  }
}
