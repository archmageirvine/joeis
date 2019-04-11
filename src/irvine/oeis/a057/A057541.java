package irvine.oeis.a057;

import irvine.oeis.LinearRecurrence;

/**
 * A057541 Birthday set of order 9: i.e., numbers congruent to <code>+- 1</code> modulo <code>2, 3, 4, 5, 6, 7, 8</code> and 9.
 * @author Sean A. Irvine
 */
public class A057541 extends LinearRecurrence {

  /** Construct the sequence. */
  public A057541() {
    super(new long[] {-1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1}, new long[] {1, 71, 449, 559, 631, 881, 1009, 1079, 1441, 1511, 1639, 1889, 1961, 2071, 2449, 2519, 2521});
  }
}
