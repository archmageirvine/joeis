package irvine.oeis.a059;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A059570 Number of fixed points in all 231-avoiding involutions in S_n.
 * @author Sean A. Irvine
 */
public class A059570 extends LinearRecurrence {

  /** Construct the sequence. */
  public A059570() {
    super(1, new long[] {-4, 0, 3}, new long[] {1, 2, 6});
  }
}
