package irvine.oeis.a037;

import irvine.oeis.LinearRecurrence;

/**
 * A037756.
 * @author Sean A. Irvine
 */
public class A037756 extends LinearRecurrence {

  /** Construct the sequence. */
  public A037756() {
    super(new long[] {-9, 10, -10, 10}, new long[] {2, 21, 190, 1710});
  }
}
