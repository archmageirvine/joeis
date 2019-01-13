package irvine.oeis.a069;

import irvine.oeis.LinearRecurrence;

/**
 * A069477.
 * @author Sean A. Irvine
 */
public class A069477 extends LinearRecurrence {

  /** Construct the sequence. */
  public A069477() {
    super(new long[] {1, -3, 3}, new long[] {390, 750, 1230});
  }
}
