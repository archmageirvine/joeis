package irvine.oeis.a141;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A141518 Period 5: repeat [1, 3, 5, 7, 9].
 * @author Sean A. Irvine
 */
public class A141518 extends LinearRecurrence {

  /** Construct the sequence. */
  public A141518() {
    super(new long[] {1, 0, 0, 0, 0}, new long[] {1, 3, 5, 7, 9});
  }
}
