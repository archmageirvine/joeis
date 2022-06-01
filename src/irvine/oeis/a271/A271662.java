package irvine.oeis.a271;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A271662 Convolution of nonzero pentagonal numbers (A000326) with themselves.
 * @author Sean A. Irvine
 */
public class A271662 extends LinearRecurrence {

  /** Construct the sequence. */
  public A271662() {
    super(new long[] {-1, 6, -15, 20, -15, 6}, new long[] {1, 10, 49, 164, 434, 980});
  }
}
