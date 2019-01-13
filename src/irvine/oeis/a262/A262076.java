package irvine.oeis.a262;

import irvine.oeis.LinearRecurrence;

/**
 * A262076.
 * @author Sean A. Irvine
 */
public class A262076 extends LinearRecurrence {

  /** Construct the sequence. */
  public A262076() {
    super(new long[] {1, -1, -3148, 3148, 1}, new long[] {26, 598, 90688, 1891916, 285495236});
  }
}
