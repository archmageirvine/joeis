package irvine.oeis.a158;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A158001 Period 6: repeat [9, 10, 9, 4, 4, 1].
 * @author Sean A. Irvine
 */
public class A158001 extends LinearRecurrence {

  /** Construct the sequence. */
  public A158001() {
    super(1, new long[] {1, 0, 0, 0, 0, 0}, new long[] {9, 10, 9, 4, 4, 1});
  }
}
