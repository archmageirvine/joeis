package irvine.oeis.a143;

import irvine.oeis.LinearRecurrence;

/**
 * A143859 Ulam's spiral <code>(WNW spoke)</code>.
 * @author Sean A. Irvine
 */
public class A143859 extends LinearRecurrence {

  /** Construct the sequence. */
  public A143859() {
    super(new long[] {1, -3, 3}, new long[] {1, 18, 67});
  }
}
