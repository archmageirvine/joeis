package irvine.oeis.a037;

import irvine.oeis.LinearRecurrence;

/**
 * A037570.
 * @author Sean A. Irvine
 */
public class A037570 extends LinearRecurrence {

  /** Construct the sequence. */
  public A037570() {
    super(new long[] {-5, 1, 0, 5}, new long[] {2, 11, 57, 287});
  }
}
