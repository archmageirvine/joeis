package irvine.oeis.a127;

import irvine.oeis.LinearRecurrence;

/**
 * A127682.
 * @author Sean A. Irvine
 */
public class A127682 extends LinearRecurrence {

  /** Construct the sequence. */
  public A127682() {
    super(new long[] {1, 0, 1, 0, 0, 0}, new long[] {0, 1, 1, 1, 1, 2});
  }
}
