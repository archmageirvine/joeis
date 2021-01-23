package irvine.oeis.a047;

import irvine.oeis.LinearRecurrence;

/**
 * A047226 Numbers that are congruent to {0, 1, 2, 3, 4} mod 6; a(n)=floor(6(n-1)/5).
 * @author Sean A. Irvine
 */
public class A047226 extends LinearRecurrence {

  /** Construct the sequence. */
  public A047226() {
    super(new long[] {-1, 1, 0, 0, 0, 1}, new long[] {0, 1, 2, 3, 4, 6});
  }
}
