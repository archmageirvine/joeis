package irvine.oeis.a141;

import irvine.oeis.LinearRecurrence;

/**
 * A141416 First differences of A133730.
 * @author Sean A. Irvine
 */
public class A141416 extends LinearRecurrence {

  /** Construct the sequence. */
  public A141416() {
    super(new long[] {2, 0, 1, 0}, new long[] {-1, -1, 2, 0});
  }
}
