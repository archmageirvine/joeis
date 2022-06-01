package irvine.oeis.a029;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A029906 Zack's sequence (the pattern is evident).
 * @author Sean A. Irvine
 */
public class A029906 extends LinearRecurrence {

  /** Construct the sequence. */
  public A029906() {
    super(new long[] {-1, 0, 0, 0, 2, 0, 0, 0}, new long[] {0, 1, 1, 2, 0, 2, 2, 4});
  }
}
