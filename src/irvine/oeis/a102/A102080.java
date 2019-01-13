package irvine.oeis.a102;

import irvine.oeis.LinearRecurrence;

/**
 * A102080.
 * @author Sean A. Irvine
 */
public class A102080 extends LinearRecurrence {

  /** Construct the sequence. */
  public A102080() {
    super(new long[] {-1, 0, 4, 2}, new long[] {2, 12, 32, 108});
  }
}
