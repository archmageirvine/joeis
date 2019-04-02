package irvine.oeis.a028;

import irvine.oeis.LinearRecurrence;

/**
 * A028563 n(n+7).
 * @author Sean A. Irvine
 */
public class A028563 extends LinearRecurrence {

  /** Construct the sequence. */
  public A028563() {
    super(new long[] {1, -3, 3}, new long[] {0, 8, 18});
  }
}
