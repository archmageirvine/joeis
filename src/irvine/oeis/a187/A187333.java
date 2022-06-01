package irvine.oeis.a187;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A187333 Floor(n/5)+floor(2n/5)+floor(3n/5)+floor(4n/5).
 * @author Sean A. Irvine
 */
public class A187333 extends LinearRecurrence {

  /** Construct the sequence. */
  public A187333() {
    super(new long[] {-1, 1, 0, 0, 0, 1}, new long[] {0, 0, 2, 4, 6, 10});
  }
}
