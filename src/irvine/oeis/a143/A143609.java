package irvine.oeis.a143;

import irvine.oeis.LinearRecurrence;

/**
 * A143609.
 * @author Sean A. Irvine
 */
public class A143609 extends LinearRecurrence {

  /** Construct the sequence. */
  public A143609() {
    super(new long[] {-1, 0, 6, 0}, new long[] {2, 3, 10, 17});
  }
}
