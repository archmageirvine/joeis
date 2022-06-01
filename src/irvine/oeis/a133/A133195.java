package irvine.oeis.a133;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A133195 Smallest number whose sum of digits is 3n.
 * @author Sean A. Irvine
 */
public class A133195 extends LinearRecurrence {

  /** Construct the sequence. */
  public A133195() {
    super(new long[] {-10, 10, 0, 1}, new long[] {0, 3, 6, 9});
  }
}
