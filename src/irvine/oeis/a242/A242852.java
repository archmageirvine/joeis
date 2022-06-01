package irvine.oeis.a242;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A242852 128*n^7-192*n^5+80*n^3-8*n.
 * @author Sean A. Irvine
 */
public class A242852 extends LinearRecurrence {

  /** Construct the sequence. */
  public A242852() {
    super(new long[] {-1, 8, -28, 56, -70, 56, -28, 8}, new long[] {0, 8, 10864, 235416, 1905632, 9409960, 34356048, 102213944});
  }
}
