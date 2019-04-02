package irvine.oeis.a046;

import irvine.oeis.LinearRecurrence;

/**
 * A046182 Indices of triangular numbers which are also octagonal.
 * @author Sean A. Irvine
 */
public class A046182 extends LinearRecurrence {

  /** Construct the sequence. */
  public A046182() {
    super(new long[] {1, -1, -98, 98, 1}, new long[] {1, 6, 153, 638, 15041});
  }
}
