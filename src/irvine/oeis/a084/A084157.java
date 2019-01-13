package irvine.oeis.a084;

import irvine.oeis.LinearRecurrence;

/**
 * A084157.
 * @author Sean A. Irvine
 */
public class A084157 extends LinearRecurrence {

  /** Construct the sequence. */
  public A084157() {
    super(new long[] {12, 0, -16, 8}, new long[] {0, 1, 4, 22});
  }
}
