package irvine.oeis.a221;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A221911 9^n + 9*n.
 * @author Sean A. Irvine
 */
public class A221911 extends LinearRecurrence {

  /** Construct the sequence. */
  public A221911() {
    super(new long[] {9, -19, 11}, new long[] {1, 18, 99});
  }
}
