package irvine.oeis.a271;

import irvine.oeis.LinearRecurrence;

/**
 * A271180.
 * @author Sean A. Irvine
 */
public class A271180 extends LinearRecurrence {

  /** Construct the sequence. */
  public A271180() {
    super(new long[] {1, -4, 4, 1, -7, 5}, new long[] {1, 1, 5, 15, 45, 125});
  }
}
