package irvine.oeis.a057;

import irvine.oeis.LinearRecurrence;

/**
 * A057367 <code>a(n) = floor(11*n/30)</code>.
 * @author Sean A. Irvine
 */
public class A057367 extends LinearRecurrence {

  /** Construct the sequence. */
  public A057367() {
    super(new long[] {-1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1}, new long[] {0, 0, 0, 1, 1, 1, 2, 2, 2, 3, 3, 4, 4, 4, 5, 5, 5, 6, 6, 6, 7, 7, 8, 8, 8, 9, 9, 9, 10, 10, 11});
  }
}
