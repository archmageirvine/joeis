package irvine.oeis.a167;

import irvine.oeis.LinearRecurrence;

/**
 * A167193.
 * @author Sean A. Irvine
 */
public class A167193 extends LinearRecurrence {

  /** Construct the sequence. */
  public A167193() {
    super(new long[] {2, 1, -2}, new long[] {1, 0, 0});
  }
}
