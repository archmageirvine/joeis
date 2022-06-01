package irvine.oeis.a070;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A070341 a(n) = 3^n mod 11: Repeat (1, 3, 9, 5, 4), period 5.
 * @author Sean A. Irvine
 */
public class A070341 extends LinearRecurrence {

  /** Construct the sequence. */
  public A070341() {
    super(new long[] {1, 0, 0, 0, 0}, new long[] {1, 3, 9, 5, 4});
  }
}
