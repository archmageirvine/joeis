package irvine.oeis.a237;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A237718 9-distance Pell numbers.
 * @author Sean A. Irvine
 */
public class A237718 extends LinearRecurrence {

  /** Construct the sequence. */
  public A237718() {
    super(new long[] {2, 0, 0, 0, 0, 0, 0, 1, 0}, new long[] {1, 1, 1, 1, 1, 1, 1, 1, 1});
  }
}
