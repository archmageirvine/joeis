package irvine.oeis.a143;

import irvine.oeis.LinearRecurrence;

/**
 * A143854 Ulam's spiral <code>(WSW spoke)</code>.
 * @author Sean A. Irvine
 */
public class A143854 extends LinearRecurrence {

  /** Construct the sequence. */
  public A143854() {
    super(new long[] {1, -3, 3}, new long[] {1, 20, 71});
  }
}
