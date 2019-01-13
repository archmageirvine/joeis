package irvine.oeis.a069;

import irvine.oeis.LinearRecurrence;

/**
 * A069190.
 * @author Sean A. Irvine
 */
public class A069190 extends LinearRecurrence {

  /** Construct the sequence. */
  public A069190() {
    super(new long[] {1, -3, 3}, new long[] {1, 25, 73});
  }
}
