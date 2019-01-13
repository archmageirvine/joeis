package irvine.oeis.a203;

import irvine.oeis.LinearRecurrence;

/**
 * A203464.
 * @author Sean A. Irvine
 */
public class A203464 extends LinearRecurrence {

  /** Construct the sequence. */
  public A203464() {
    super(new long[] {-1, 1, 0, 0, 1}, new long[] {4, 9, 56, 61, 69});
  }
}
