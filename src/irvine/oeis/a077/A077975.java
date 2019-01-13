package irvine.oeis.a077;

import irvine.oeis.LinearRecurrence;

/**
 * A077975.
 * @author Sean A. Irvine
 */
public class A077975 extends LinearRecurrence {

  /** Construct the sequence. */
  public A077975() {
    super(new long[] {2, -1, -1}, new long[] {1, -1, 0});
  }
}
