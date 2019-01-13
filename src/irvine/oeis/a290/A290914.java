package irvine.oeis.a290;

import irvine.oeis.LinearRecurrence;

/**
 * A290914.
 * @author Sean A. Irvine
 */
public class A290914 extends LinearRecurrence {

  /** Construct the sequence. */
  public A290914() {
    super(new long[] {-1, 4, 1, 4}, new long[] {0, 1, 4, 17});
  }
}
