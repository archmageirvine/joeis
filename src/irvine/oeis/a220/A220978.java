package irvine.oeis.a220;

import irvine.oeis.LinearRecurrence;

/**
 * A220978.
 * @author Sean A. Irvine
 */
public class A220978 extends LinearRecurrence {

  /** Construct the sequence. */
  public A220978() {
    super(new long[] {27, -39, 13}, new long[] {1, 19, 217});
  }
}
