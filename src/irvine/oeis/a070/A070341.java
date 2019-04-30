package irvine.oeis.a070;

import irvine.oeis.LinearRecurrence;

/**
 * A070341 <code>a(n) = 3^n mod 11</code>: Repeat <code>(1, 3, 9, 5, 4)</code>, period 5.
 * @author Sean A. Irvine
 */
public class A070341 extends LinearRecurrence {

  /** Construct the sequence. */
  public A070341() {
    super(new long[] {1, 0, 0, 0, 0}, new long[] {1, 3, 9, 5, 4});
  }
}
