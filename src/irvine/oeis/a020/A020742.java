package irvine.oeis.a020;

import irvine.oeis.LinearRecurrence;

/**
 * A020742 Pisot sequence T(7,9).
 * @author Sean A. Irvine
 */
public class A020742 extends LinearRecurrence {

  /** Construct the sequence. */
  public A020742() {
    super(new long[] {-1, 2}, new long[] {7, 9});
  }
}
