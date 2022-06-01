package irvine.oeis.a083;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A083065 4th row of number array A083064.
 * @author Sean A. Irvine
 */
public class A083065 extends LinearRecurrence {

  /** Construct the sequence. */
  public A083065() {
    super(new long[] {-5, 6}, new long[] {1, 4});
  }
}
