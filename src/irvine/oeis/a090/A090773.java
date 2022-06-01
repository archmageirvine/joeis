package irvine.oeis.a090;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A090773 Numbers that are congruent to {4, 6} mod 10.
 * @author Sean A. Irvine
 */
public class A090773 extends LinearRecurrence {

  /** Construct the sequence. */
  public A090773() {
    super(new long[] {-1, 1, 1}, new long[] {4, 6, 14});
  }
}
