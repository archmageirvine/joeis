package irvine.oeis.a162;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A162436 a(n) = 3*a(n-2) for n &gt; 2; a(1) = 1, a(2) = 3.
 * @author Sean A. Irvine
 */
public class A162436 extends LinearRecurrence {

  /** Construct the sequence. */
  public A162436() {
    super(1, new long[] {3, 0}, new long[] {1, 3});
  }
}
