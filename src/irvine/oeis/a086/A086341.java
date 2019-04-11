package irvine.oeis.a086;

import irvine.oeis.LinearRecurrence;

/**
 * A086341 <code>a(n) = 2*2^floor(n/2) - (-1)^n</code>.
 * @author Sean A. Irvine
 */
public class A086341 extends LinearRecurrence {

  /** Construct the sequence. */
  public A086341() {
    super(new long[] {2, 2, -1}, new long[] {1, 3, 3});
  }
}
