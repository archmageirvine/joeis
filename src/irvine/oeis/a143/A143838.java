package irvine.oeis.a143;

import irvine.oeis.LinearRecurrence;

/**
 * A143838 Ulam's spiral <code>(SSW spoke)</code>.
 * @author Sean A. Irvine
 */
public class A143838 extends LinearRecurrence {

  /** Construct the sequence. */
  public A143838() {
    super(new long[] {1, -3, 3}, new long[] {1, 22, 75});
  }
}
