package irvine.oeis.a259;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A259402 Pentagonal numbers (A000326) that are the sum of seven consecutive pentagonal numbers.
 * @author Sean A. Irvine
 */
public class A259402 extends LinearRecurrence {

  /** Construct the sequence. */
  public A259402() {
    super(1, new long[] {1, -1, -64514, 64514, 1}, new long[] {287, 532, 17145051, 32963672, 1106094475927L});
  }
}
