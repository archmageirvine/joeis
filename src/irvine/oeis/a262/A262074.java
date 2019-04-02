package irvine.oeis.a262;

import irvine.oeis.LinearRecurrence;

/**
 * A262074 The first of seven consecutive positive integers the sum of the squares of which is equal to the sum of the squares of eight consecutive positive integers.
 * @author Sean A. Irvine
 */
public class A262074 extends LinearRecurrence {

  /** Construct the sequence. */
  public A262074() {
    super(new long[] {1, -31, 31}, new long[] {113, 3473, 104161});
  }
}
