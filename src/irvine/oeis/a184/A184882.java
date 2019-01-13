package irvine.oeis.a184;

import irvine.oeis.LinearRecurrence;

/**
 * A184882.
 * @author Sean A. Irvine
 */
public class A184882 extends LinearRecurrence {

  /** Construct the sequence. */
  public A184882() {
    super(new long[] {1, -3, 3}, new long[] {1, -7, -23});
  }
}
