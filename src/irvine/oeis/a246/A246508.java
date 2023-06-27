package irvine.oeis.a246;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A246508 Digital root of numbers congruent to {1,7,11,13,17,19,23,29} modulo 30.
 * @author Sean A. Irvine
 */
public class A246508 extends LinearRecurrence {

  /** Construct the sequence. */
  public A246508() {
    super(1, new long[] {1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new long[] {1, 7, 2, 4, 8, 1, 5, 2, 4, 1, 5, 7, 2, 4, 8, 5, 7, 4, 8, 1, 5, 7, 2, 8});
  }
}
