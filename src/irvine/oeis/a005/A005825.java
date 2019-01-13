package irvine.oeis.a005;

import irvine.oeis.LinearRecurrence;

/**
 * A005825.
 * @author Sean A. Irvine
 */
public class A005825 extends LinearRecurrence {

  /** Construct the sequence. */
  public A005825() {
    super(new long[] {4, -10, 0, 5}, new long[] {0, 1, 7, 31});
  }
}

