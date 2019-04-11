package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041964 Numerators of continued fraction convergents to <code>sqrt(505)</code>.
 * @author Sean A. Irvine
 */
public class A041964 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041964() {
    super(new long[] {-1, 0, 0, 0, 1618, 0, 0, 0}, new long[] {22, 45, 382, 809, 35978, 72765, 618098, 1308961});
  }
}
