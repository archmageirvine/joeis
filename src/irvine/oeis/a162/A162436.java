package irvine.oeis.a162;

import irvine.oeis.LinearRecurrence;

/**
 * A162436 a(n) = 3*a(n-2) for n &gt; 2; a(1) = 1, a(2) = 3.
 * @author Sean A. Irvine
 */
public class A162436 extends LinearRecurrence {

  /** Construct the sequence. */
  public A162436() {
    super(new long[] {3, 0}, new long[] {1, 3});
  }
}
