package irvine.oeis.a177;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A177704 Period 4: repeat [1, 1, 1, 2].
 * @author Sean A. Irvine
 */
public class A177704 extends LinearRecurrence {

  /** Construct the sequence. */
  public A177704() {
    super(new long[] {1, 0, 0, 0}, new long[] {1, 1, 1, 2});
  }
}
