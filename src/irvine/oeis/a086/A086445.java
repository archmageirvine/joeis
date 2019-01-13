package irvine.oeis.a086;

import irvine.oeis.LinearRecurrence;

/**
 * A086445.
 * @author Sean A. Irvine
 */
public class A086445 extends LinearRecurrence {

  /** Construct the sequence. */
  public A086445() {
    super(new long[] {2, -3, -1, 3}, new long[] {1, 2, 4, 7});
  }
}
