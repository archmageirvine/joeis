package irvine.oeis.a024;

import irvine.oeis.LinearRecurrence;

/**
 * A024386.
 * @author Sean A. Irvine
 */
public class A024386 extends LinearRecurrence {

  /** Construct the sequence. */
  public A024386() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {3, 29, 114, 310, 685});
  }
}
