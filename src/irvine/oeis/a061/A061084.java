package irvine.oeis.a061;

import irvine.oeis.LinearRecurrence;

/**
 * A061084.
 * @author Sean A. Irvine
 */
public class A061084 extends LinearRecurrence {

  /** Construct the sequence. */
  public A061084() {
    super(new long[] {1, -1}, new long[] {1, 2});
  }
}
