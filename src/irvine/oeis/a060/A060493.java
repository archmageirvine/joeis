package irvine.oeis.a060;

import irvine.oeis.LinearRecurrence;

/**
 * A060493 A diagonal of <code>A036969</code>.
 * @author Sean A. Irvine
 */
public class A060493 extends LinearRecurrence {

  /** Construct the sequence. */
  public A060493() {
    super(new long[] {1, -7, 21, -35, 35, -21, 7}, new long[] {1, 21, 147, 627, 2002, 5278, 12138});
  }
}
