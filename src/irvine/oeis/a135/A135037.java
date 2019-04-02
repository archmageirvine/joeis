package irvine.oeis.a135;

import irvine.oeis.LinearRecurrence;

/**
 * A135037 Sums of the products of n consecutive triples of numbers.
 * @author Sean A. Irvine
 */
public class A135037 extends LinearRecurrence {

  /** Construct the sequence. */
  public A135037() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {0, 60, 396, 1386, 3570});
  }
}
