package irvine.oeis.a053;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A053309 Partial sums of A053308.
 * @author Sean A. Irvine
 */
public class A053309 extends LinearRecurrence {

  /** Construct the sequence. */
  public A053309() {
    super(new long[] {-1, 8, -26, 39, -6, -84, 168, -174, 111, -44, 10}, new long[] {1, 10, 56, 231, 782, 2300, 6085, 14820, 33775, 72905, 150438});
  }
}
