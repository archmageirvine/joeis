package irvine.oeis.a110;

import irvine.oeis.LinearRecurrence;

/**
 * A110325.
 * @author Sean A. Irvine
 */
public class A110325 extends LinearRecurrence {

  /** Construct the sequence. */
  public A110325() {
    super(new long[] {1, -3, 3}, new long[] {1, 0, -5});
  }
}
