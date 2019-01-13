package irvine.oeis.a242;

import irvine.oeis.LinearRecurrence;

/**
 * A242510.
 * @author Sean A. Irvine
 */
public class A242510 extends LinearRecurrence {

  /** Construct the sequence. */
  public A242510() {
    super(new long[] {-1, 1, 2, 1}, new long[] {1, 2, 3, 8});
  }
}
