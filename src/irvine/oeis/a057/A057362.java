package irvine.oeis.a057;

import irvine.oeis.LinearRecurrence;

/**
 * A057362 <code>a(n) = floor(5*n/13)</code>.
 * @author Sean A. Irvine
 */
public class A057362 extends LinearRecurrence {

  /** Construct the sequence. */
  public A057362() {
    super(new long[] {-1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1}, new long[] {0, 0, 0, 1, 1, 1, 2, 2, 3, 3, 3, 4, 4, 5});
  }
}
