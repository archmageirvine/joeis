package irvine.oeis.a242;

import irvine.oeis.LinearRecurrence;

/**
 * A242329 a(n) = 5^n + 4.
 * @author Sean A. Irvine
 */
public class A242329 extends LinearRecurrence {

  /** Construct the sequence. */
  public A242329() {
    super(new long[] {-5, 6}, new long[] {5, 9});
  }
}
