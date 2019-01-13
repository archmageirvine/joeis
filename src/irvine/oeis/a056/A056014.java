package irvine.oeis.a056;

import irvine.oeis.LinearRecurrence;

/**
 * A056014.
 * @author Sean A. Irvine
 */
public class A056014 extends LinearRecurrence {

  /** Construct the sequence. */
  public A056014() {
    super(new long[] {1, -2, -3, 4}, new long[] {0, 0, 0, 1});
  }
}
