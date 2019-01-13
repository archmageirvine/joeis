package irvine.oeis.a077;

import irvine.oeis.LinearRecurrence;

/**
 * A077925.
 * @author Sean A. Irvine
 */
public class A077925 extends LinearRecurrence {

  /** Construct the sequence. */
  public A077925() {
    super(new long[] {2, -1}, new long[] {1, -1});
  }
}
