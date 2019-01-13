package irvine.oeis.a221;

import irvine.oeis.LinearRecurrence;

/**
 * A221763.
 * @author Sean A. Irvine
 */
public class A221763 extends LinearRecurrence {

  /** Construct the sequence. */
  public A221763() {
    super(new long[] {-1, 0, 20, 0}, new long[] {1, 4, 16, 79});
  }
}
