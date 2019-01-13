package irvine.oeis.a070;

import irvine.oeis.LinearRecurrence;

/**
 * A070514.
 * @author Sean A. Irvine
 */
public class A070514 extends LinearRecurrence {

  /** Construct the sequence. */
  public A070514() {
    super(new long[] {1, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new long[] {0, 1, 6, 1, 6, 5, 6, 1, 6, 1});
  }
}
