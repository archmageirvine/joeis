package irvine.oeis.a014;

import irvine.oeis.LinearRecurrence;

/**
 * A014113.
 * @author Sean A. Irvine
 */
public class A014113 extends LinearRecurrence {

  /** Construct the sequence. */
  public A014113() {
    super(new long[] {2, 1}, new long[] {0, 2});
  }
}
