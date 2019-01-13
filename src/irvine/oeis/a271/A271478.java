package irvine.oeis.a271;

import irvine.oeis.LinearRecurrence;

/**
 * A271478.
 * @author Sean A. Irvine
 */
public class A271478 extends LinearRecurrence {

  /** Construct the sequence. */
  public A271478() {
    super(new long[] {-1, 0, 2, 0}, new long[] {0, 4, 1, 8});
  }
}
