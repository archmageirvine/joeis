package irvine.oeis.a259;

import irvine.oeis.LinearRecurrence;

/**
 * A259402.
 * @author Sean A. Irvine
 */
public class A259402 extends LinearRecurrence {

  /** Construct the sequence. */
  public A259402() {
    super(new long[] {1, -1, -64514, 64514, 1}, new long[] {287, 532, 17145051, 32963672, 1106094475927L});
  }
}
