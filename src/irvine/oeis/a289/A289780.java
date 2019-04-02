package irvine.oeis.a289;

import irvine.oeis.LinearRecurrence;

/**
 * A289780 p-INVERT of the positive integers (A000027), where p(S) = 1 - S - S^2.
 * @author Sean A. Irvine
 */
public class A289780 extends LinearRecurrence {

  /** Construct the sequence. */
  public A289780() {
    super(new long[] {-1, 5, -7, 5}, new long[] {1, 4, 14, 47});
  }
}
