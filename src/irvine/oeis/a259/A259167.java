package irvine.oeis.a259;

import irvine.oeis.LinearRecurrence;

/**
 * A259167.
 * @author Sean A. Irvine
 */
public class A259167 extends LinearRecurrence {

  /** Construct the sequence. */
  public A259167() {
    super(new long[] {1, -9603, 9603}, new long[] {8, 78408, 752875208});
  }
}
