package irvine.oeis.a083;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A083068 7th row of number array A083064.
 * @author Sean A. Irvine
 */
public class A083068 extends LinearRecurrence {

  /** Construct the sequence. */
  public A083068() {
    super(new long[] {-8, 9}, new long[] {1, 7});
  }
}
