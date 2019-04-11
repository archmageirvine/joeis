package irvine.oeis.a257;

import irvine.oeis.LinearRecurrence;

/**
 * A257849 <code>a(n) = floor(n/9) * (n mod 9)</code>.
 * @author Sean A. Irvine
 */
public class A257849 extends LinearRecurrence {

  /** Construct the sequence. */
  public A257849() {
    super(new long[] {-1, 0, 0, 0, 0, 0, 0, 0, 0, 2, 0, 0, 0, 0, 0, 0, 0, 0}, new long[] {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 2, 3, 4, 5, 6, 7, 8});
  }
}
