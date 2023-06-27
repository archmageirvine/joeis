package irvine.oeis.a135;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A135036 Sums of the products of n consecutive pairs of numbers.
 * @author Sean A. Irvine
 */
public class A135036 extends LinearRecurrence {

  /** Construct the sequence. */
  public A135036() {
    super(1, new long[] {-1, 4, -6, 4}, new long[] {0, 6, 26, 68});
  }
}
