package irvine.oeis.a070;

import irvine.oeis.LinearRecurrence;

/**
 * A070423.
 * @author Sean A. Irvine
 */
public class A070423 extends LinearRecurrence {

  /** Construct the sequence. */
  public A070423() {
    super(new long[] {1, 0, 0, 0}, new long[] {1, 7, 9, 23});
  }
}
