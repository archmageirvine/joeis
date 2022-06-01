package irvine.oeis.a079;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A079291 Squares of Pell numbers.
 * @author Sean A. Irvine
 */
public class A079291 extends LinearRecurrence {

  /** Construct the sequence. */
  public A079291() {
    super(new long[] {-1, 5, 5}, new long[] {0, 1, 4});
  }
}
