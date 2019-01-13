package irvine.oeis.a020;

import irvine.oeis.LinearRecurrence;

/**
 * A020698.
 * @author Sean A. Irvine
 */
public class A020698 extends LinearRecurrence {

  /** Construct the sequence. */
  public A020698() {
    super(new long[] {-2, 5}, new long[] {2, 9});
  }
}
