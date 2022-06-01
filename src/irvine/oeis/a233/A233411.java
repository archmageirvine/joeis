package irvine.oeis.a233;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A233411 The number of length n binary words with some prefix which contains two more 1's than 0's or two more 0's than 1's.
 * @author Sean A. Irvine
 */
public class A233411 extends LinearRecurrence {

  /** Construct the sequence. */
  public A233411() {
    super(new long[] {-4, 2, 2}, new long[] {0, 0, 2});
  }
}
