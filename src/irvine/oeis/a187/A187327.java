package irvine.oeis.a187;

import irvine.oeis.LinearRecurrence;

/**
 * A187327 Floor(n/5)+floor(2n/5)+floor(3n/5).
 * @author Sean A. Irvine
 */
public class A187327 extends LinearRecurrence {

  /** Construct the sequence. */
  public A187327() {
    super(new long[] {-1, 1, 0, 0, 0, 1}, new long[] {0, 0, 1, 2, 3, 6});
  }
}
