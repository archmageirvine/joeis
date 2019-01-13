package irvine.oeis.a091;

import irvine.oeis.LinearRecurrence;

/**
 * A091972.
 * @author Sean A. Irvine
 */
public class A091972 extends LinearRecurrence {

  /** Construct the sequence. */
  public A091972() {
    super(new long[] {-1, 1, -1, 2, -1, 1}, new long[] {1, 0, 0, 1, 1, 1});
  }
}
