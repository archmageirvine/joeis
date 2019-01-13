package irvine.oeis.a070;

import irvine.oeis.LinearRecurrence;

/**
 * A070355.
 * @author Sean A. Irvine
 */
public class A070355 extends LinearRecurrence {

  /** Construct the sequence. */
  public A070355() {
    super(new long[] {1, 0, 0, 0, 0}, new long[] {1, 3, 9, 5, 15});
  }
}
