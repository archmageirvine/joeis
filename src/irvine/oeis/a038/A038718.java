package irvine.oeis.a038;

import irvine.oeis.LinearRecurrence;

/**
 * A038718.
 * @author Sean A. Irvine
 */
public class A038718 extends LinearRecurrence {

  /** Construct the sequence. */
  public A038718() {
    super(new long[] {-1, 1, -1, 2}, new long[] {1, 1, 2, 4});
  }
}
