package irvine.oeis.a053;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A053469 a(n) = n*6^(n-1).
 * @author Sean A. Irvine
 */
public class A053469 extends LinearRecurrence {

  /** Construct the sequence. */
  public A053469() {
    super(new long[] {-36, 12}, new long[] {1, 12});
  }
}
