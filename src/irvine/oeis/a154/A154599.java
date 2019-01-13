package irvine.oeis.a154;

import irvine.oeis.LinearRecurrence;

/**
 * A154599.
 * @author Sean A. Irvine
 */
public class A154599 extends LinearRecurrence {

  /** Construct the sequence. */
  public A154599() {
    super(new long[] {1, -3, 3}, new long[] {30, 56, 86});
  }
}
