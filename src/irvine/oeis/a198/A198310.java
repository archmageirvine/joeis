package irvine.oeis.a198;

import irvine.oeis.LinearRecurrence;

/**
 * A198310.
 * @author Sean A. Irvine
 */
public class A198310 extends LinearRecurrence {

  /** Construct the sequence. */
  public A198310() {
    super(new long[] {-9, 9, 1}, new long[] {11, 20, 101});
  }
}
