package irvine.oeis.a205;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A205185 Period 6: repeat [1, 8, 9, 8, 1, 0].
 * @author Sean A. Irvine
 */
public class A205185 extends LinearRecurrence {

  /** Construct the sequence. */
  public A205185() {
    super(1, new long[] {1, 0, 0, 0, 0, 0}, new long[] {1, 8, 9, 8, 1, 0});
  }
}
