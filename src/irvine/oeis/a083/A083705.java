package irvine.oeis.a083;

import irvine.oeis.LinearRecurrence;

/**
 * A083705.
 * @author Sean A. Irvine
 */
public class A083705 extends LinearRecurrence {

  /** Construct the sequence. */
  public A083705() {
    super(new long[] {-2, 3}, new long[] {10, 19});
  }
}
