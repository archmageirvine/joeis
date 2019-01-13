package irvine.oeis.a195;

import irvine.oeis.LinearRecurrence;

/**
 * A195062.
 * @author Sean A. Irvine
 */
public class A195062 extends LinearRecurrence {

  /** Construct the sequence. */
  public A195062() {
    super(new long[] {1, 0, 0, 0, 0, 0, 0}, new long[] {1, 0, 1, 0, 1, 0, 1});
  }
}
