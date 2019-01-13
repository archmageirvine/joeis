package irvine.oeis.a028;

import irvine.oeis.LinearRecurrence;

/**
 * A028094.
 * @author Sean A. Irvine
 */
public class A028094 extends LinearRecurrence {

  /** Construct the sequence. */
  public A028094() {
    super(new long[] {-2079, 1410, -320, 30}, new long[] {1, 30, 580, 9210});
  }
}
