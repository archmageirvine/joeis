package irvine.oeis.a271;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A271832 Period 12 zigzag sequence: repeat [0,1,2,3,4,5,6,5,4,3,2,1].
 * @author Sean A. Irvine
 */
public class A271832 extends LinearRecurrence {

  /** Construct the sequence. */
  public A271832() {
    super(new long[] {1, -1, 0, 0, 0, 0, 1}, new long[] {0, 1, 2, 3, 4, 5, 6});
  }
}
