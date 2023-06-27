package irvine.oeis.a070;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A070260 Third diagonal of triangle defined in A051537.
 * @author Sean A. Irvine
 */
public class A070260 extends LinearRecurrence {

  /** Construct the sequence. */
  public A070260() {
    super(1, new long[] {1, 0, -3, 0, 3, 0}, new long[] {3, 2, 15, 6, 35, 12});
  }
}
