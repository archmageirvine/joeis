package irvine.oeis.a162;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A162356 a(n) = 8*a(n-1)-14*a(n-2) for n&gt;1; a(0) = 2; a(1) = 9.
 * @author Sean A. Irvine
 */
public class A162356 extends LinearRecurrence {

  /** Construct the sequence. */
  public A162356() {
    super(new long[] {-14, 8}, new long[] {2, 9});
  }
}
