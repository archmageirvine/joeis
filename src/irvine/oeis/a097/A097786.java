package irvine.oeis.a097;

import irvine.oeis.LinearRecurrence;

/**
 * A097786.
 * @author Sean A. Irvine
 */
public class A097786 extends LinearRecurrence {

  /** Construct the sequence. */
  public A097786() {
    super(new long[] {3, -13, 22, -18, 7}, new long[] {1, 7, 31, 113, 374});
  }
}
